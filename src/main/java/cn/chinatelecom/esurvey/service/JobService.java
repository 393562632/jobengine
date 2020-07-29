package cn.chinatelecom.esurvey.service;

import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.JobDO;
import cn.chinatelecom.esurvey.entity.requestResult;
import cn.chinatelecom.esurvey.model.vo.AnswerVO;
import java.util.List;

public interface JobService {


    Integer InsertConfig(JobConfig jobConfig);

    List<requestResult> getAll();

    void startJob(int id,String pyPath,String jsonPath);

    void stopJob(int id);

}
