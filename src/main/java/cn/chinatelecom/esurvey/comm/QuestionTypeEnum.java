package cn.chinatelecom.esurvey.comm;

/**
 * 问题类型
 */
public enum QuestionTypeEnum {

    SingleChoice("2", "单选"),
    Text("1", "问答题"),
    MutiChoice("3", "多选"),
    DropList("4", "下拉"),
    MutiText("5", "多行文本框"),
    DateTime("6", "时间控件"),
    UploadFile("7","上传控件");

     /**
     * 类型小类
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    QuestionTypeEnum(String code, String desc) {
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
