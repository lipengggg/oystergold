package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetPersonSalary;
import com.itoystergold.pojo.AssetPersonSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetPersonSalaryMapper {
    int countByExample(AssetPersonSalaryExample example);

    int deleteByExample(AssetPersonSalaryExample example);

    int deleteByPrimaryKey(String sid);

    int insert(AssetPersonSalary record);

    int insertSelective(AssetPersonSalary record);

    List<AssetPersonSalary> selectByExample(AssetPersonSalaryExample example);

    AssetPersonSalary selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") AssetPersonSalary record, @Param("example") AssetPersonSalaryExample example);

    int updateByExample(@Param("record") AssetPersonSalary record, @Param("example") AssetPersonSalaryExample example);

    int updateByPrimaryKeySelective(AssetPersonSalary record);

    int updateByPrimaryKey(AssetPersonSalary record);
}