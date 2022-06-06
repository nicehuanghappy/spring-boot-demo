package com.bob.demo2.mapper;

import com.bob.demo2.entity.Test;
import com.bob.demo2.entity.TestExample;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(TestExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(TestExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Test record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Test record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Test selectByPrimaryKeyWithLock(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Test selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Test record);
}