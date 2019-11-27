package com.buoyantec.dao;

import com.buoyantec.dataobject.grouprightrelationDO;
import com.buoyantec.dataobject.grouprightrelationDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface grouprightrelationDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    long countByExample(grouprightrelationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int deleteByExample(grouprightrelationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int deleteByPrimaryKey(Long tgrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int insert(grouprightrelationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int insertSelective(grouprightrelationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    List<grouprightrelationDO> selectByExample(grouprightrelationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    grouprightrelationDO selectByPrimaryKey(Long tgrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") grouprightrelationDO record, @Param("example") grouprightrelationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByExample(@Param("record") grouprightrelationDO record, @Param("example") grouprightrelationDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByPrimaryKeySelective(grouprightrelationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_grouprightrelation
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByPrimaryKey(grouprightrelationDO record);
}