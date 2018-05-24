package com.itoystergold.mapper;

import com.itoystergold.pojo.Vipuser;
import com.itoystergold.pojo.VipuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipuserMapper {
    int countByExample(VipuserExample example);

    int deleteByExample(VipuserExample example);

    int deleteByPrimaryKey(String vid);

    int insert(Vipuser record);

    int insertSelective(Vipuser record);

    List<Vipuser> selectByExample(VipuserExample example);

    Vipuser selectByPrimaryKey(String vid);

    int updateByExampleSelective(@Param("record") Vipuser record, @Param("example") VipuserExample example);

    int updateByExample(@Param("record") Vipuser record, @Param("example") VipuserExample example);

    int updateByPrimaryKeySelective(Vipuser record);

    int updateByPrimaryKey(Vipuser record);
}