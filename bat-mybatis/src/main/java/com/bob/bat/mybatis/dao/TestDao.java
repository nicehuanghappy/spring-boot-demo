package com.bob.bat.mybatis.dao;

import com.bob.bat.mybatis.entity.TestEntity;

/**
* @author hwy
* @description 针对表【test(testdemo)】的数据库操作Mapper
* @Entity com.bob.bat.Test
*/
public interface TestDao {

    int deleteByPrimaryKey(Long id);

    int insert(TestEntity record);

    int insertSelective(TestEntity record);

    TestEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestEntity record);

    int updateByPrimaryKey(TestEntity record);

}
