package com.bob.bat.online.service;

import com.bob.bat.online.dto.TestDemoInputDto;
import com.bob.bat.mybatis.dao.TestDao;
import com.bob.bat.mybatis.entity.TestEntity;
import com.bob.bat.online.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TestService class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/6
 */
@Slf4j
@Service
public class TestCurdDemo {
//    @Resource
    private TestDao testDao;
    public int insert(TestDemoInputDto testDemoInputDto) {
        TestEntity testEntity = testDao.selectByPrimaryKey(Long.valueOf(testDemoInputDto.getId()));
        if (testEntity != null) {
            log.error("主键重复");
            throw new BusinessException();
        }
        TestEntity testEntity1 = new TestEntity();
        testEntity1.setId(testDemoInputDto.getId());
        testEntity1.setClientName(testDemoInputDto.getClientName());
        testEntity1.setCreatTime(testDemoInputDto.getCreateTime());
        return testDao.insert(testEntity1);

    }

}