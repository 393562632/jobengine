package cn.chinatelecom.esurvey.dao;

import cn.chinatelecom.esurvey.entity.JobDO;
import java.util.List;

public interface JobDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobDO record);

    JobDO selectByPrimaryKey(Integer id);

    List<JobDO> selectAll();

    int updateByPrimaryKey(JobDO record);
}