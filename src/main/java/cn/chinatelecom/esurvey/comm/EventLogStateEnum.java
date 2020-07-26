package cn.chinatelecom.esurvey.comm;

public enum EventLogStateEnum {

    InitEventLog("0", "init"),
    SubmitEventLog("1", "submit");

    /**
     * 类型小类
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    EventLogStateEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }


}
