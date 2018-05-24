package com.itoystergold.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itoystergold.pojo.Item;
import com.itoystergold.pojo.ItemExample;

public interface ItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int countByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int deleteByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    List<Item> selectByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    Item selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Item record);
}