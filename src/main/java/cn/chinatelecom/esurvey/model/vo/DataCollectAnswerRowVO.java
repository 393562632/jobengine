package cn.chinatelecom.esurvey.model.vo;

import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  问卷回收视图
 *
 */
public class DataCollectAnswerRowVO implements Serializable {

    private static final long serialVersionUID = -3743083360917228250L;

    private String id;

    private List<DataCollectQuestionVO> answer;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<DataCollectQuestionVO> getAnswer() {
        return answer;
    }

    public void setAnswer(List<DataCollectQuestionVO> answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
