package cn.chinatelecom.esurvey.utils;

import cn.chinatelecom.esurvey.RestResult;
import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

public class ControllerLogUtils {

    private final static Logger logger = LoggerFactory.getLogger(ControllerLogUtils.class);

    /**
     * Controller 接口接受参数时候打印的log
     *
     * @param target
     * @param path
     * @param bindingResult
     * @param timer
     * @param <T>
     * @return
     */
    public static <T> RestResult LoggingBefore(T target, String path, BindingResult bindingResult,
                                               Date timer) {
        logger.info("当前调用的接口为: " + path + " 调用时间为 : {}  , 输入参数为：{} ", timer,
                JSON.toJSONString(target));
        return BindingResults.getResult(bindingResult, path, timer);


    }



    public static <T> void LoggingBefore(T target, String path, Date timer) {
        logger.info("当前调用的接口为: " + path + " 调用时间为 : {}  , 输入参数为：{} ", timer,
                JSON.toJSONString(target));
    }

    public static void LoggingBefore(String target, String path, Date timer) {
        logger.info("当前调用的接口为: " + path + " 调用时间为 : {}  , 输入参数为：{} ", timer,
                target);
    }


    /**
     * Controller 接口返回参数时打印的log
     *
     * @param result
     * @param path
     * @param timer
     * @param <T>
     * @return
     */
    public static <T> void LoggingAfter(T result, String path, Date timer) {
        logger.info("当前调用的接口为: " + path + " 调用时间为 : {}  , 输出参数为：{} ", timer, result);

    }
}
