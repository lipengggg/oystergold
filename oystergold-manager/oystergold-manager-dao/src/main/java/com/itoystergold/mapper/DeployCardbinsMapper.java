package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployCardbins;
import com.itoystergold.pojo.DeployCardbinsExample;
import com.itoystergold.pojo.DeployCardbinsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployCardbinsMapper {
    int countByExample(DeployCardbinsExample example);

    int deleteByExample(DeployCardbinsExample example);

    int deleteByPrimaryKey(DeployCardbinsKey key);

    int insert(DeployCardbins record);

    int insertSelective(DeployCardbins record);

    List<DeployCardbins> selectByExample(DeployCardbinsExample example);

    DeployCardbins selectByPrimaryKey(DeployCardbinsKey key);

    int updateByExampleSelective(@Param("record") DeployCardbins record, @Param("example") DeployCardbinsExample example);

    int updateByExample(@Param("record") DeployCardbins record, @Param("example") DeployCardbinsExample example);

    int updateByPrimaryKeySelective(DeployCardbins record);

    int updateByPrimaryKey(DeployCardbins record);
}