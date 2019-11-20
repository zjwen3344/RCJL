package com.buoyantec.dao;

import com.buoyantec.dataobject.newsDO;
import com.buoyantec.dataobject.newsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface newsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    long countByExample(newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int deleteByExample(newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int deleteByPrimaryKey(Long tnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int insert(newsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int insertSelective(newsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    List<newsDO> selectByExampleWithBLOBs(newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    List<newsDO> selectByExample(newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    newsDO selectByPrimaryKey(Long tnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByExampleSelective(@Param("record") newsDO record, @Param("example") newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") newsDO record, @Param("example") newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByExample(@Param("record") newsDO record, @Param("example") newsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByPrimaryKeySelective(newsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(newsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_news
     *
     * @mbg.generated Wed Nov 20 16:34:40 CST 2019
     */
    int updateByPrimaryKey(newsDO record);
}