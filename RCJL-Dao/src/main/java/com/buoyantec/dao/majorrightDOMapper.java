package com.buoyantec.dao;

import com.buoyantec.dataobject.majorrightDO;
import com.buoyantec.dataobject.majorrightDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface majorrightDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    long countByExample(majorrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int deleteByExample(majorrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int deleteByPrimaryKey(Long tmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int insert(majorrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int insertSelective(majorrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    List<majorrightDO> selectByExample(majorrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    majorrightDO selectByPrimaryKey(Long tmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") majorrightDO record, @Param("example") majorrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByExample(@Param("record") majorrightDO record, @Param("example") majorrightDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByPrimaryKeySelective(majorrightDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_majorright
     *
     * @mbg.generated Mon Nov 25 10:09:14 CST 2019
     */
    int updateByPrimaryKey(majorrightDO record);
}