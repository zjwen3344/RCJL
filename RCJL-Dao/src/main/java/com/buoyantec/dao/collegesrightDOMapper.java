package com.buoyantec.dao;

import com.buoyantec.dataobject.collegesrightDO;
import com.buoyantec.dataobject.collegesrightDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface collegesrightDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    long countByExample(collegesrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int deleteByExample(collegesrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int deleteByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int insert(collegesrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int insertSelective(collegesrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    List<collegesrightDO> selectByExample(collegesrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    collegesrightDO selectByPrimaryKey(Long tcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") collegesrightDO record, @Param("example") collegesrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByExample(@Param("record") collegesrightDO record, @Param("example") collegesrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByPrimaryKeySelective(collegesrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_collegesright
     *
     * @mbg.generated Mon Nov 25 17:04:01 CST 2019
     */
    int updateByPrimaryKey(collegesrightDO record);
}