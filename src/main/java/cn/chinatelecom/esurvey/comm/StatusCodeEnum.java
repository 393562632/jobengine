package cn.chinatelecom.esurvey.comm;

/**
 * 业务返回码
 */
public enum StatusCodeEnum implements StatusCode {
    SuccessStatus(true, "200", "成功"),

    EmptyDataComm(true, "200", "暂无数据"),

    EmptyMachine(true, "200", "暂无数据"),

    EmptyCluster(true, "200", "根据输入暂无数据"),

    PageNoOverFlow(false, "200", "页数溢出"),

    CommException(false, "200", "系统异常"),

    QuestionnnaireEmptyCluster(true, "200", "根据输入数据问券查询为空"),

    QuestionnEmptyCluster(true, "200", "根据输入数据问题查询为空"),

    ChoiceEmptyCluster(true, "200", "根据输入数据选项查询为空"),


    EmptyToken(false, "200", "获取Token失败"),

    DB_INIT_ERROR(false, "200", "db初始化异常"),

    SIT_NOT_EXIST(false, "200", "问卷id不存在"),

    RIT_NOT_EXIST(false, "200", "投放id不存在"),

    CHOICE_NOT_EXIST(false, "200", "选择项不存在"),

    QUESTION_NOT_EXIST(false, "200", "问题不存在"),

    ERROR_INPUT(false, "202", "输入错误"),
    DB_ERROR(false, "401", "DB异常");;

    /**
     * 系统状态
     */
    private boolean success;

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回码描述
     */
    private String message;

    /**
     * 构造函数
     */
    StatusCodeEnum(boolean success, String code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    @Override
    public boolean isSuccess() {
        return success;
    }
}
