package cn.chinatelecom.esurvey.model.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 问卷
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionnaireVO implements Serializable {

    private static final long serialVersionUID = -6459346884232889453L;


    private Integer questionnaireId;

    private Date gmtCreate;

    private Date gmtModify;

    //@NotBlank(message = "问券多外链接地址不能为空")
    private String questionnareUrl;

    @NotNull(message = "用户id不能为空")
    private Integer userId;

    @NotBlank(message = "问券题目不能为空")
    private String title;

    private String desc;

    private String content;

    /**
     * 问题列表
     */
    @NotNull(message = "问题列表不能为空")
    private List<QuestionVO> questionList;

    private UserVO user;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
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

    public String getQuestionnareUrl() {
        return questionnareUrl;
    }

    public void setQuestionnareUrl(String questionnareUrl) {
        this.questionnareUrl = questionnareUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<QuestionVO> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionVO> questionList) {
        this.questionList = questionList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
