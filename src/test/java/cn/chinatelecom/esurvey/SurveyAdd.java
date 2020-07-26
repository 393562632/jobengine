package cn.chinatelecom.esurvey;


import cn.chinatelecom.esurvey.model.vo.ChoiceVO;
import cn.chinatelecom.esurvey.model.vo.QuestionVO;
import cn.chinatelecom.esurvey.model.vo.QuestionnaireVO;
import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SurveyAdd {

    private final static Logger logger = LoggerFactory.getLogger(SurveyAdd.class);


    @Test
    public void add() {
        logger.info(" Test post data");
        RestTemplate restTemplate = new RestTemplate();

        // 初始化问券
        QuestionnaireVO questionnaireVO = new QuestionnaireVO();

        // 初始化问券列表
        questionnaireVO.setDesc("测试");
        questionnaireVO.setGmtCreate(new Date());
        questionnaireVO.setQuestionnaireId(111);
        questionnaireVO.setQuestionnareUrl("url");
        questionnaireVO.setTitle("测试问券");
        questionnaireVO.setUserId(123);

        // 问题列表
        List<QuestionVO> questionVOList = new ArrayList<>();
        // 初始化问答
        QuestionVO questionVO = new QuestionVO();
        questionVO.setQuestionId("q-1-1");
        questionVO.setGmtCreate(new Date());
        // 1 问答   2 选择
        questionVO.setQuestionType("1");
        questionVO.setQuestionContent("测试");

        // 装配
        questionVOList.add(questionVO);

        // 初始化选择
        QuestionVO questionVO_2 = new QuestionVO();
        questionVO_2.setQuestionId("q-1-2");
        questionVO_2.setGmtCreate(new Date());
        // 1 问答   2 选择
        questionVO_2.setQuestionType("2");
        questionVO_2.setQuestionContent("测试");

        List<ChoiceVO> choiceList = new ArrayList<>();

        ChoiceVO choiceVO = new ChoiceVO();
        choiceVO.setChoiceId("c-1-2-3");
        choiceVO.setChoiceContent("A");

        ChoiceVO choiceVO_2 = new ChoiceVO();
        choiceVO_2.setChoiceId("c-1-2-4");
        choiceVO_2.setChoiceContent("A");

        choiceList.add(choiceVO);
        choiceList.add(choiceVO_2);

        questionVO_2.setChoiceList(choiceList);
        questionVOList.add(questionVO_2);
        questionnaireVO.setQuestionList(questionVOList);

        String data = JSON.toJSONString(questionnaireVO);
        logger.info(data);
        //String result = restTemplate.postForObject("http://127.0.0.1/esurvey/admin/add", questionnaireVO, String.class);
        //logger.info("返回值为 ： {}", result);

    }


}
