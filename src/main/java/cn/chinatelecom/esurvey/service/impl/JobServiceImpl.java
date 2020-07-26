package cn.chinatelecom.esurvey.service.impl;

import cn.chinatelecom.esurvey.dao.JobDOMapper;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.JobDO;
import cn.chinatelecom.esurvey.jobs.Container;
import cn.chinatelecom.esurvey.jobs.DataxJob;
import cn.chinatelecom.esurvey.service.JobService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("JobService")
public class JobServiceImpl implements JobService {

    private static Logger logger = LoggerFactory.getLogger(JobServiceImpl.class);

    @Autowired
    private JobDOMapper jobDOMapper;


    @Override
    public void InsertConfig(JobConfig jobConfig) {
        String config = JSON.toJSONString(jobConfig);
        JobDO jobDO = new JobDO();
        jobDO.setConfig(config);
        jobDO.setStatus(0);
        jobDOMapper.insert(jobDO);
    }

    @Override
    public List<JobConfig> getAll() {
        List list = jobDOMapper.selectAll();
        return list;
    }

    @Override
    public void startJob(int id) {
        JobDO jobDO = jobDOMapper.selectByPrimaryKey(id);
        String config = jobDO.getConfig();
        JobConfig jobConfig = JSON.parseObject(config, JobConfig.class);
        DataxJob dataxJob = new DataxJob(jobConfig.getFrequency(), Boolean.TRUE);
        Container.start(dataxJob, id);
    }

    @Override
    public void stopJob(int id) {
        Container.stop(id);
    }


//    @Override
//    public boolean submitAnswer(Integer sid, Integer rid, String uuid,
//
//
//        return true;
//    }

//    @Transactional
//    private void insertBatch(List<AnswerDO> answerDOList) {
//        try {
//            for (AnswerDO answerDO : answerDOList) {
//                answerDOMapper.insert(answerDO);
//            }
//        } catch (Exception e) {
//            LoggerUtils.error(logger, e, "批量掺入答案异常");
//
//            throw new BizException(StatusCodeEnum.DB_ERROR, e);
//        }
//    }
}
