package com.itoystergold.mapper;

import com.itoystergold.pojo.DeployClsbank;
import com.itoystergold.pojo.DeployClsbankExample;
import com.itoystergold.pojo.DeployClsbankKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeployClsbankMapper {
    int countByExample(DeployClsbankExample example);

    int deleteByExample(DeployClsbankExample example);

    int deleteByPrimaryKey(DeployClsbankKey key);

    int insert(DeployClsbank record);

    int insertSelective(DeployClsbank record);

    List<DeployClsbank> selectByExample(DeployClsbankExample example);

    DeployClsbank selectByPrimaryKey(DeployClsbankKey key);

    int updateByExampleSelective(@Param("record") DeployClsbank record, @Param("example") DeployClsbankExample example);

    int updateByExample(@Param("record") DeployClsbank record, @Param("example") DeployClsbankExample example);

    int updateByPrimaryKeySelective(DeployClsbank record);

    int updateByPrimaryKey(DeployClsbank record);
}