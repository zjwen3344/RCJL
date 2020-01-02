package com.buoyantec.dao;

import com.buoyantec.dataobject.ttwocategory;
import com.buoyantec.dataobject.ttwocategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ttwocategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    long countByExample(ttwocategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int deleteByExample(ttwocategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int deleteByPrimaryKey(Long ttId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int insert(ttwocategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int insertSelective(ttwocategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    List<ttwocategory> selectByExample(ttwocategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    ttwocategory selectByPrimaryKey(Long ttId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") ttwocategory record, @Param("example") ttwocategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int updateByExample(@Param("record") ttwocategory record, @Param("example") ttwocategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int updateByPrimaryKeySelective(ttwocategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_twocategory
     *
     * @mbg.generated Wed Dec 25 17:51:30 CST 2019
     */
    int updateByPrimaryKey(ttwocategory record);
}