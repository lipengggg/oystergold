package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetRechargeSerial;
import com.itoystergold.pojo.AssetRechargeSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetRechargeSerialMapper {
    int countByExample(AssetRechargeSerialExample example);

    int deleteByExample(AssetRechargeSerialExample example);

    int deleteByPrimaryKey(String rid);

    int insert(AssetRechargeSerial record);

    int insertSelective(AssetRechargeSerial record);

    List<AssetRechargeSerial> selectByExample(AssetRechargeSerialExample example);

    AssetRechargeSerial selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") AssetRechargeSerial record, @Param("example") AssetRechargeSerialExample example);

    int updateByExample(@Param("record") AssetRechargeSerial record, @Param("example") AssetRechargeSerialExample example);

    int updateByPrimaryKeySelective(AssetRechargeSerial record);

    int updateByPrimaryKey(AssetRechargeSerial record);
}