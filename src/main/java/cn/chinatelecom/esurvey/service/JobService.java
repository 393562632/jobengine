package cn.chinatelecom.esurvey.service;

import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.model.vo.AnswerVO;
import java.util.List;

public interface JobService {


    void InsertConfig(JobConfig jobConfig);

    List<JobConfig> getAll();

    void startJob(int id);

    void stopJob(int id);

}
