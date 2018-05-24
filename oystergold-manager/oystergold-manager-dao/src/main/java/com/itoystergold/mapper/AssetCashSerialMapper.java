package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetCashSerial;
import com.itoystergold.pojo.AssetCashSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetCashSerialMapper {
    int countByExample(AssetCashSerialExample example);

    int deleteByExample(AssetCashSerialExample example);

    int deleteByPrimaryKey(String sid);

    int insert(AssetCashSerial record);

    int insertSelective(AssetCashSerial record);

    List<AssetCashSerial> selectByExample(AssetCashSerialExample example);

    AssetCashSerial selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") AssetCashSerial record, @Param("example") AssetCashSerialExample example);

    int updateByExample(@Param("record") AssetCashSerial record, @Param("example") AssetCashSerialExample example);

    int updateByPrimaryKeySelective(AssetCashSerial record);

    int updateByPrimaryKey(AssetCashSerial record);
}