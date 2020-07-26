package cn.chinatelecom.esurvey.comm;

/**
 * 账户类型
 */
public enum AccountTypeEnum {

    SysType("0", "系统用户"),
    TencentType("1", "腾讯用户");

    /**
     * 类型
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    AccountTypeEnum(String code, String desc) {
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
