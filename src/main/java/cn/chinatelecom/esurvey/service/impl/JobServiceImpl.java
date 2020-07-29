package cn.chinatelecom.esurvey.service.impl;

import cn.chinatelecom.esurvey.dao.JobDOMapper;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.JobDO;
import cn.chinatelecom.esurvey.entity.requestResult;
import cn.chinatelecom.esurvey.jobs.Container;
import cn.chinatelecom.esurvey.jobs.DataxJob;
import cn.chinatelecom.esurvey.service.JobService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("JobService")
public class JobServiceImpl implements JobService {

    private static Logger logger = LoggerFactory.getLogger(JobServiceImpl.class);

    @Autowired
    private JobDOMapper jobDOMapper;


    @Override
    public Integer InsertConfig(JobConfig jobConfig) {
        String config = JSON.toJSONString(jobConfig);
        JobDO jobDO = new JobDO();
        jobDO.setConfig(config);
        jobDO.setStatus(0);
        jobDOMapper.insert(jobDO);
        return jobDO.getId();
    }

    @Override
    public List<requestResult> getAll() {
        List<requestResult> results = new ArrayList<>();
        List<JobDO> list = (List<JobDO>)jobDOMapper.selectAll();
        for (JobDO temp : list) {
            requestResult result = new requestResult();
            Integer id = temp.getId();
            DataxJob dataxJob = Container.contain.get(id);
            if(dataxJob!=null){
                result.setStatus(0);
            }else{
                result.setStatus(1);
            }
            JSONObject jsonObject = JSONObject.parseObject(temp.getConfig());
          result.setApiName(jsonObject.get("apiName").toString());
          result.setId(temp.getId());
          result.setFrequency(Long.parseLong(jsonObject.get("frequency").toString()));
          results.add(result);
        }
        return results;
    }

    @Override
    public void startJob(int id,String pypath,String jsonPath) {
        JobDO jobDO = jobDOMapper.selectByPrimaryKey(id);
        String config = jobDO.getConfig();
        JobConfig jobConfig = JSON.parseObject(config, JobConfig.class);
        DataxJob dataxJob = new DataxJob(jobConfig.getFrequency(), Boolean.TRUE,pypath,id,jsonPath);
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
