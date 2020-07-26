package cn.chinatelecom.esurvey.comm;

/**
 * 系统异常
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1053524770077110374L;

    /**
     * 异常枚举
     */
    private StatusCodeEnum bizCodeEnum;


    /**
     * 构造函数
     */
    public BizException(StatusCodeEnum bizCodeEnum, String message, Throwable cause) {
        super(message, cause);
        this.bizCodeEnum = bizCodeEnum;
    }

    /**
     * 构造函数
     */
    public BizException(StatusCodeEnum bizCodeEnum, Throwable cause) {
        super(cause);
        this.bizCodeEnum = bizCodeEnum;
    }

    /**
     * 构造函数
     */
    public BizException(StatusCodeEnum bizCodeEnum, String message) {
        super(message);
        this.bizCodeEnum = bizCodeEnum;
    }

    /**
     * 构造函数
     */
    public BizException(StatusCodeEnum bizCodeEnum) {
        this.bizCodeEnum = bizCodeEnum;
    }

    /**
     * 构造函数
     */
    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造函数
     */
    public BizException() {
    }

    public StatusCodeEnum getBizCodeEnum() {
        return bizCodeEnum;
    }

    public void setBizCodeEnum(StatusCodeEnum bizCodeEnum) {
        this.bizCodeEnum = bizCodeEnum;
    }
}
