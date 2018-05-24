package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployLevel;
import com.itoystergold.pojo.DeployLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployLevelMapper {
    int countByExample(DeployLevelExample example);

    int deleteByExample(DeployLevelExample example);

    int deleteByPrimaryKey(String lid);

    int insert(DeployLevel record);

    int insertSelective(DeployLevel record);

    List<DeployLevel> selectByExample(DeployLevelExample example);

    DeployLevel selectByPrimaryKey(String lid);

    int updateByExampleSelective(@Param("record") DeployLevel record, @Param("example") DeployLevelExample example);

    int updateByExample(@Param("record") DeployLevel record, @Param("example") DeployLevelExample example);

    int updateByPrimaryKeySelective(DeployLevel record);

    int updateByPrimaryKey(DeployLevel record);
}