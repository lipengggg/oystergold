package com.itoystergold.mapper;

import com.itoystergold.pojo.VipPackageAmt;
import com.itoystergold.pojo.VipPackageAmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipPackageAmtMapper {
    int countByExample(VipPackageAmtExample example);

    int deleteByExample(VipPackageAmtExample example);

    int deleteByPrimaryKey(String pid);

    int insert(VipPackageAmt record);

    int insertSelective(VipPackageAmt record);

    List<VipPackageAmt> selectByExample(VipPackageAmtExample example);

    VipPackageAmt selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") VipPackageAmt record, @Param("example") VipPackageAmtExample example);

    int updateByExample(@Param("record") VipPackageAmt record, @Param("example") VipPackageAmtExample example);

    int updateByPrimaryKeySelective(VipPackageAmt record);

    int updateByPrimaryKey(VipPackageAmt record);
}