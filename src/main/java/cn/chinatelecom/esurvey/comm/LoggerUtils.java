package cn.chinatelecom.esurvey.comm;

import org.slf4j.Logger;

/**
 * 日志工具类
 */
public class LoggerUtils {

    /**
     * info级别日志
     */
    public static void info(Logger logger, Object... args) {
        if (logger.isInfoEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object : args) {
                if (object != null) {
                    stringBuilder.append(object.toString());
                } else {
                    stringBuilder.append("null");
                }

            }

            logger.info(stringBuilder.toString());
        }
    }

    /**
     * 错误日志
     */
    public static void error(Logger logger, Throwable throwable, Object... args) {
        if (logger.isErrorEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object : args) {
                if (object != null) {
                    stringBuilder.append(object.toString());
                } else {
                    stringBuilder.append("null");
                }

            }

            logger.error(stringBuilder.toString(), throwable);
        }
    }

    /**
     * 告警日志
     */
    public static void warn(Logger logger, Object... args) {
        if (logger.isWarnEnabled()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object object : args) {
                if (object != null) {
                    stringBuilder.append(object.toString());
                } else {
                    stringBuilder.append("null");
                }

            }

            logger.warn(stringBuilder.toString());
        }
    }
}
