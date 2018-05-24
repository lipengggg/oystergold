package com.itoystergold.mapper;

import com.itoystergold.pojo.AssetStock;
import com.itoystergold.pojo.AssetStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetStockMapper {
    int countByExample(AssetStockExample example);

    int deleteByExample(AssetStockExample example);

    int deleteByPrimaryKey(String sid);

    int insert(AssetStock record);

    int insertSelective(AssetStock record);

    List<AssetStock> selectByExample(AssetStockExample example);

    AssetStock selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") AssetStock record, @Param("example") AssetStockExample example);

    int updateByExample(@Param("record") AssetStock record, @Param("example") AssetStockExample example);

    int updateByPrimaryKeySelective(AssetStock record);

    int updateByPrimaryKey(AssetStock record);
}