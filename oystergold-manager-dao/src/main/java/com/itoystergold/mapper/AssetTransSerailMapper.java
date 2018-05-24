package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetTransSerail;
import com.itoystergold.pojo.AssetTransSerailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetTransSerailMapper {
    int countByExample(AssetTransSerailExample example);

    int deleteByExample(AssetTransSerailExample example);

    int deleteByPrimaryKey(String tid);

    int insert(AssetTransSerail record);

    int insertSelective(AssetTransSerail record);

    List<AssetTransSerail> selectByExample(AssetTransSerailExample example);

    AssetTransSerail selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") AssetTransSerail record, @Param("example") AssetTransSerailExample example);

    int updateByExample(@Param("record") AssetTransSerail record, @Param("example") AssetTransSerailExample example);

    int updateByPrimaryKeySelective(AssetTransSerail record);

    int updateByPrimaryKey(AssetTransSerail record);
}