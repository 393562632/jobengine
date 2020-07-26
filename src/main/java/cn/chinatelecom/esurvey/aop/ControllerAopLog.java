package cn.chinatelecom.esurvey.aop;


import cn.chinatelecom.esurvey.comm.LoggerUtils;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class ControllerAopLog {

    private final static Logger logger = LoggerFactory.getLogger("LOGGER_CONTROLLER_DIGEST");

    @Pointcut("execution(public * cn.chinatelecom.esurvey.controller..*.*(..))")
    public void controllerAop() {
    }

    @Before("controllerAop()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
            .getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String url = request.getRequestURI();
        Object[] args = joinPoint.getArgs();

        LoggerUtils.info(logger, "request = ", "url = ", url,
            "; request = ", Arrays.toString(args));
    }

    @AfterReturning(returning = "object", pointcut = "controllerAop()")
    public void doAfterReturning(Object object) {
        LoggerUtils.info(logger, "response = ", object == null ? null : object.toString());
    }

}
