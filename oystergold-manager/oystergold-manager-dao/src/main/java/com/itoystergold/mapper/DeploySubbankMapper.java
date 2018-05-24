package com.itoystergold.mapper;

import com.itoystergold.pojo.DeploySubbank;
import com.itoystergold.pojo.DeploySubbankExample;
import com.itoystergold.pojo.DeploySubbankKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeploySubbankMapper {
    int countByExample(DeploySubbankExample example);

    int deleteByExample(DeploySubbankExample example);

    int deleteByPrimaryKey(DeploySubbankKey key);

    int insert(DeploySubbank record);

    int insertSelective(DeploySubbank record);

    List<DeploySubbank> selectByExample(DeploySubbankExample example);

    DeploySubbank selectByPrimaryKey(DeploySubbankKey key);

    int updateByExampleSelective(@Param("record") DeploySubbank record, @Param("example") DeploySubbankExample example);

    int updateByExample(@Param("record") DeploySubbank record, @Param("example") DeploySubbankExample example);

    int updateByPrimaryKeySelective(DeploySubbank record);

    int updateByPrimaryKey(DeploySubbank record);
}