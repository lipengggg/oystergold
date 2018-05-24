package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetSettleSerial;
import com.itoystergold.pojo.AssetSettleSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSettleSerialMapper {
    int countByExample(AssetSettleSerialExample example);

    int deleteByExample(AssetSettleSerialExample example);

    int deleteByPrimaryKey(String sid);

    int insert(AssetSettleSerial record);

    int insertSelective(AssetSettleSerial record);

    List<AssetSettleSerial> selectByExample(AssetSettleSerialExample example);

    AssetSettleSerial selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") AssetSettleSerial record, @Param("example") AssetSettleSerialExample example);

    int updateByExample(@Param("record") AssetSettleSerial record, @Param("example") AssetSettleSerialExample example);

    int updateByPrimaryKeySelective(AssetSettleSerial record);

    int updateByPrimaryKey(AssetSettleSerial record);
}