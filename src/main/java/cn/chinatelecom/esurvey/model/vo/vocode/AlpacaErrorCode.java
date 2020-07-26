package cn.chinatelecom.esurvey.model.vo.vocode;

import cn.chinatelecom.esurvey.ex.exception.ServiceExceptionEnum;

public enum AlpacaErrorCode implements ServiceExceptionEnum {

    NULL_OBJ(501, "对象为空"),
    ERROR_ADD_USER(502, "添加用户失败"),
    UNKNOWN_ERROR(503, "系统繁忙，请稍后再试...."),
    INPUT_PARAM_ERROR(504, "参数错误请校验"),
    HDFS_CONFIG_ERROR(505, "HDFS配置参数失败"),
    HDFS_UPLOAD_FILE_ERROR(506, "上传文件失败");


    private Integer value;
    private String desc;

    private AlpacaErrorCode(Integer value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]" + this.desc;
    }

    @Override
    public Integer getCode() {
        return this.value;
    }

    @Override
    public String getMessage() {
        return this.desc;
    }
}
