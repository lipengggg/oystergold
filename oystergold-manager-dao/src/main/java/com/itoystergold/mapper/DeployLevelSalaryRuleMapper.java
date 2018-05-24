package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployLevelSalaryRule;
import com.itoystergold.pojo.DeployLevelSalaryRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployLevelSalaryRuleMapper {
    int countByExample(DeployLevelSalaryRuleExample example);

    int deleteByExample(DeployLevelSalaryRuleExample example);

    int deleteByPrimaryKey(String rid);

    int insert(DeployLevelSalaryRule record);

    int insertSelective(DeployLevelSalaryRule record);

    List<DeployLevelSalaryRule> selectByExample(DeployLevelSalaryRuleExample example);

    DeployLevelSalaryRule selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") DeployLevelSalaryRule record, @Param("example") DeployLevelSalaryRuleExample example);

    int updateByExample(@Param("record") DeployLevelSalaryRule record, @Param("example") DeployLevelSalaryRuleExample example);

    int updateByPrimaryKeySelective(DeployLevelSalaryRule record);

    int updateByPrimaryKey(DeployLevelSalaryRule record);
}