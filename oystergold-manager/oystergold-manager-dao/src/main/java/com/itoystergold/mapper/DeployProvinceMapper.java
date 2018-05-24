package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployProvince;
import com.itoystergold.pojo.DeployProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployProvinceMapper {
    int countByExample(DeployProvinceExample example);

    int deleteByExample(DeployProvinceExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeployProvince record);

    int insertSelective(DeployProvince record);

    List<DeployProvince> selectByExample(DeployProvinceExample example);

    DeployProvince selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeployProvince record, @Param("example") DeployProvinceExample example);

    int updateByExample(@Param("record") DeployProvince record, @Param("example") DeployProvinceExample example);

    int updateByPrimaryKeySelective(DeployProvince record);

    int updateByPrimaryKey(DeployProvince record);
}