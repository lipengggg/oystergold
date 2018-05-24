package com.itoystergold.mapper;

import com.itoystergold.pojo.VipCar;
import com.itoystergold.pojo.VipCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipCarMapper {
    int countByExample(VipCarExample example);

    int deleteByExample(VipCarExample example);

    int deleteByPrimaryKey(String id);

    int insert(VipCar record);

    int insertSelective(VipCar record);

    List<VipCar> selectByExample(VipCarExample example);

    VipCar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VipCar record, @Param("example") VipCarExample example);

    int updateByExample(@Param("record") VipCar record, @Param("example") VipCarExample example);

    int updateByPrimaryKeySelective(VipCar record);

    int updateByPrimaryKey(VipCar record);
}