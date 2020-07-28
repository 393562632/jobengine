package cn.chinatelecom.esurvey.dao;

import cn.chinatelecom.esurvey.entity.JobDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface JobDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobDO record);

    JobDO selectByPrimaryKey(Integer id);

    List<JobDO> selectAll();

    int updateByPrimaryKey(JobDO record);
}