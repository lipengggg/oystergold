package com.itoystergold.mapper;

import com.itoystergold.pojo.VipuserInfo;
import com.itoystergold.pojo.VipuserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipuserInfoMapper {
    int countByExample(VipuserInfoExample example);

    int deleteByExample(VipuserInfoExample example);

    int deleteByPrimaryKey(String vid);

    int insert(VipuserInfo record);

    int insertSelective(VipuserInfo record);

    List<VipuserInfo> selectByExample(VipuserInfoExample example);

    VipuserInfo selectByPrimaryKey(String vid);

    int updateByExampleSelective(@Param("record") VipuserInfo record, @Param("example") VipuserInfoExample example);

    int updateByExample(@Param("record") VipuserInfo record, @Param("example") VipuserInfoExample example);

    int updateByPrimaryKeySelective(VipuserInfo record);

    int updateByPrimaryKey(VipuserInfo record);
}