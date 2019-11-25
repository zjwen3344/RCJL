package com.buoyantec.dao;

import com.buoyantec.dataobject.speyearsDO;
import com.buoyantec.dataobject.speyearsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface speyearsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    long countByExample(speyearsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int deleteByExample(speyearsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int deleteByPrimaryKey(Long tsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int insert(speyearsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int insertSelective(speyearsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    List<speyearsDO> selectByExample(speyearsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    speyearsDO selectByPrimaryKey(Long tsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") speyearsDO record, @Param("example") speyearsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByExample(@Param("record") speyearsDO record, @Param("example") speyearsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByPrimaryKeySelective(speyearsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_speyears
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByPrimaryKey(speyearsDO record);
}