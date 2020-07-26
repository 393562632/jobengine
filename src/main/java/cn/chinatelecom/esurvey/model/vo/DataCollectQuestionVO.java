package cn.chinatelecom.esurvey.model.vo;

import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DataCollectQuestionVO  implements Serializable {

    private static final long serialVersionUID = -8198776069316677713L;

    private String title;

    private String id;

    private String type;

    private String file_name_src;

    private String file_name_dst;

    private String text;

    private List<DataCollectOptionVO> options;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile_name_src() {
        return file_name_src;
    }

    public void setFile_name_src(String file_name_src) {
        this.file_name_src = file_name_src;
    }

    public String getFile_name_dst() {
        return file_name_dst;
    }

    public void setFile_name_dst(String file_name_dst) {
        this.file_name_dst = file_name_dst;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<DataCollectOptionVO> getOptions() {
        return options;
    }

    public void setOptions(List<DataCollectOptionVO> options) {
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
