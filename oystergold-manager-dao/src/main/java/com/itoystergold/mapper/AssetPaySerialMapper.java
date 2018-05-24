package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetPaySerial;
import com.itoystergold.pojo.AssetPaySerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetPaySerialMapper {
    int countByExample(AssetPaySerialExample example);

    int deleteByExample(AssetPaySerialExample example);

    int deleteByPrimaryKey(String pid);

    int insert(AssetPaySerial record);

    int insertSelective(AssetPaySerial record);

    List<AssetPaySerial> selectByExample(AssetPaySerialExample example);

    AssetPaySerial selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") AssetPaySerial record, @Param("example") AssetPaySerialExample example);

    int updateByExample(@Param("record") AssetPaySerial record, @Param("example") AssetPaySerialExample example);

    int updateByPrimaryKeySelective(AssetPaySerial record);

    int updateByPrimaryKey(AssetPaySerial record);
}