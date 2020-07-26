//package cn.chinatelecom.esurvey.interceptor;
//
//import cn.chinatelecom.esurvey.comm.SystemConsts;
//import java.util.UUID;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.slf4j.MDC;
//import org.springframework.lang.Nullable;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//@Component
//public class RequestInfoInterceptor implements HandlerInterceptor {
//
//    //添加mdc
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//        Object handler) throws Exception {
//        UUID uuid = UUID.randomUUID();
//        String traceId = uuid.toString().replace("-", "");
//        MDC.put(SystemConsts.TRACE_ID, traceId);
//
//        return true;
//    }
//
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//        @Nullable ModelAndView modelAndView) throws Exception {
//    }
//
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//        Object handler, @Nullable Exception ex) throws Exception {
//    }
//}
