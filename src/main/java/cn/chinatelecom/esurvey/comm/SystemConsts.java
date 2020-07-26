package cn.chinatelecom.esurvey.comm;

/**
 * 系统常量
 */
public class SystemConsts {

    /**
     * url路径
     */
    public static final String URL_PREFIX = "/{product}/{region}/{appname}/api/v1/";

    /**
     * 状态正常
     */
    public static final String NORMAL_SERVICE_STATUS = "normal";

    /**
     * 状态异常
     */
    public static final String EXCEPT_SERVICE_STATUS = "except";

    /**
     * 超时时间
     */
    public static final int SERVICE_CHECK_TIMEOUT = 1000;

    /**
     * trace
     */
    public static final String TRACE_ID = "traceId";

    /**
     * traceid
     */
    public final static String SY_TRACE_ID = "sy_trace_id";

    /**
     * user
     */
    public final static String SY_SSO_USER = "sy_sso_user";

    /**
     * 行结尾
     */
    public static String LINE_END = "\n";

    /**
     * 行分隔符
     *
     */
    public static String COMMA = ",";

}
