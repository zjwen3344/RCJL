package com.buoyantec.dao;

import com.buoyantec.dataobject.classrightDO;
import com.buoyantec.dataobject.classrightDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface classrightDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    long countByExample(classrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int deleteByExample(classrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int deleteByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int insert(classrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int insertSelective(classrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    List<classrightDO> selectByExample(classrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    classrightDO selectByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByExampleSelective(@Param("record") classrightDO record, @Param("example") classrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByExample(@Param("record") classrightDO record, @Param("example") classrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByPrimaryKeySelective(classrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_classright
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByPrimaryKey(classrightDO record);
}