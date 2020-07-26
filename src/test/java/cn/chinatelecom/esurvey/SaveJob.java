package cn.chinatelecom.esurvey;

import cn.chinatelecom.esurvey.comm.UUIDUtil;
import cn.chinatelecom.esurvey.entity.JobConfig;
import cn.chinatelecom.esurvey.entity.RelationItem;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveJob {

    private final static Logger logger = LoggerFactory.getLogger(SaveJob.class);


    @Test
    public void SaveJob() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost/jobEngine/addConfig";
        JobConfig jobConfig = new JobConfig();
        jobConfig.setFrequency(1);
        jobConfig.setUrl("127.9.2.3");
        //  请求参数, key 为对应的值 value为对应的值
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("sex", "1");
        requestMap.put("name", "jackey");
        jobConfig.setRequestMap(requestMap);
        //  字段映射关系列表
        List<RelationItem> relationItemList = new ArrayList<>();
        RelationItem relationItem = new RelationItem();
        relationItem.setResponseName("sex");
        relationItem.setHiveName("sex");
        relationItem.setType("int");
        relationItemList.add(relationItem);
        RelationItem relationItem2 = new RelationItem();
        relationItem2.setResponseName("name");
        relationItem2.setHiveName("name");
        relationItem2.setType("String");
        relationItemList.add(relationItem2);
        jobConfig.setRelationItemList(relationItemList);
        String body = JSON.toJSONString(jobConfig);
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<String> formEntity = new HttpEntity<String>(body, headers);
        String result= restTemplate.postForEntity(url,formEntity,String.class).getBody();
        logger.info(result);
    }


    @Test
    public void getAll() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://localhost/jobEngine/listAll";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }


    @Test
    public void startJob() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://localhost/jobEngine/start/1";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }

    @Test
    public void stopJob() {
        RestTemplate restTemplate = new RestTemplate();
        String accessTokenRequestUrl = "http://localhost/jobEngine/stop/1";
        String jstoken = restTemplate.getForObject(accessTokenRequestUrl,String.class);
        logger.info(jstoken);
    }

}
