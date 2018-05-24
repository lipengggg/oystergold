package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetSalarySerial;
import com.itoystergold.pojo.AssetSalarySerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSalarySerialMapper {
    int countByExample(AssetSalarySerialExample example);

    int deleteByExample(AssetSalarySerialExample example);

    int deleteByPrimaryKey(String sid);

    int insert(AssetSalarySerial record);

    int insertSelective(AssetSalarySerial record);

    List<AssetSalarySerial> selectByExample(AssetSalarySerialExample example);

    AssetSalarySerial selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") AssetSalarySerial record, @Param("example") AssetSalarySerialExample example);

    int updateByExample(@Param("record") AssetSalarySerial record, @Param("example") AssetSalarySerialExample example);

    int updateByPrimaryKeySelective(AssetSalarySerial record);

    int updateByPrimaryKey(AssetSalarySerial record);
}