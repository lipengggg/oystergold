package com.itoystergold.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itoystergold.pojo.VipUserInfo;
import com.itoystergold.pojo.VipUserInfoExample;

public interface VipUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int countByExample(VipUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int deleteByExample(VipUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int insert(VipUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int insertSelective(VipUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    List<VipUserInfo> selectByExample(VipUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    VipUserInfo selectByPrimaryKey(String vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VipUserInfo record, @Param("example") VipUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VipUserInfo record, @Param("example") VipUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(VipUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vipuser_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VipUserInfo record);
}