package cn.chinatelecom.esurvey.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionVO implements Serializable {

    private static final long serialVersionUID = 3906325703751935161L;

    private String questionId;

    private Integer questionnaireId;

    /**
     * questionType 为1是问答 questionType 为2是选择
     */
    private String questionType;

    private Date gmtCreate;

    private Date gmtModify;

    private String questionContent;

    private List<ChoiceVO> choiceList;


    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public List<ChoiceVO> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<ChoiceVO> choiceList) {
        this.choiceList = choiceList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
