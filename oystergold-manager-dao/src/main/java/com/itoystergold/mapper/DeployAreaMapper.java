package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployArea;
import com.itoystergold.pojo.DeployAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployAreaMapper {
    int countByExample(DeployAreaExample example);

    int deleteByExample(DeployAreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeployArea record);

    int insertSelective(DeployArea record);

    List<DeployArea> selectByExample(DeployAreaExample example);

    DeployArea selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeployArea record, @Param("example") DeployAreaExample example);

    int updateByExample(@Param("record") DeployArea record, @Param("example") DeployAreaExample example);

    int updateByPrimaryKeySelective(DeployArea record);

    int updateByPrimaryKey(DeployArea record);
}