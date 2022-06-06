package com.bob.demo2.service;

import com.bob.demo2.dto.TestDTO;
import com.bob.demo2.entity.Test;
import com.bob.demo2.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

/**
 * TestService class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/6
 */
@Slf4j
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;
    public  int insert(TestDTO testDTO){
        Test testDO=new Test();
        testDO.setId(testDTO.getId());
        testDO.setClientName(testDTO.getChClientName());
        testDO.setCreatTime(testDTO.getCreateTime());
        return testMapper.insert(testDO);
    }
    public int deleteByPrimaryKey(String id){
        return testMapper.deleteByPrimaryKey(id);
    }
    public int updateByPrimaryKeySelective(TestDTO testDTO){
        Test testDO=new Test();
        testDO.setId(testDTO.getId());
        testDO.setClientName(testDTO.getChClientName());
        testDO.setCreatTime(testDTO.getCreateTime());
        return testMapper.updateByPrimaryKeySelective(testDO);
    }
    public TestDTO selectByPrimaryKey(String id){
        TestDTO testDTO=new TestDTO();
        Test testDO=testMapper.selectByPrimaryKey(id);
        testDTO.setId(testDO.getId());
        testDTO.setChClientName(testDO.getClientName());
        testDTO.setCreateTime(testDO.getCreatTime());
        return testDTO;
    }
}