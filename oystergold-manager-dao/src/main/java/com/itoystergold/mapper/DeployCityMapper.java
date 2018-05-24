package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployCity;
import com.itoystergold.pojo.DeployCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployCityMapper {
    int countByExample(DeployCityExample example);

    int deleteByExample(DeployCityExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeployCity record);

    int insertSelective(DeployCity record);

    List<DeployCity> selectByExample(DeployCityExample example);

    DeployCity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeployCity record, @Param("example") DeployCityExample example);

    int updateByExample(@Param("record") DeployCity record, @Param("example") DeployCityExample example);

    int updateByPrimaryKeySelective(DeployCity record);

    int updateByPrimaryKey(DeployCity record);
}