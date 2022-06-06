package com.bob.demo2.controller;

import com.bob.bole.bums.api.model.head.HeadOut;
import com.bob.bole.halo.framework.check.api.annotation.StartCheck;
import com.bob.demo2.dto.TestDTO;
import com.bob.demo2.service.TestService;
import com.bob.demo2.vo.TestOutputVO;
import com.bob.demo2.vo.TestVO;
import lombok.ToString;
import com.bob.bole.halo.exception.util.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TestController class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/5
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;
    @StartCheck(isOne = false)
    @RequestMapping("/demo")
    public TestOutputVO demo(@RequestBody TestVO testVO, BindingResult bindingResult) throws Exception{
        log.info("插入数据为：{}",testVO);
        if(bindingResult.hasErrors()){
            List<ObjectError> errorList=bindingResult.getAllErrors();
            log.info("参数校验失败：{}",errorList);
            throw ExceptionUtil.createBusinessException ("000001",new Throwable(""));

        }
        TestDTO testDTO=new TestDTO();
        testDTO.setId(testVO.getId());
        testDTO.setChClientName(testVO.getChClientName());
        testDTO.setCreateTime(testVO.getCreateTime());
        testService.insert(testDTO);
        HeadOut headOut=new HeadOut();
        TestOutputVO testOutputVO=new TestOutputVO(headOut);
        testOutputVO.getHead().setRetCode("000000");
        testOutputVO.getHead().setRetMsg("成功");
        testOutputVO.getHead().setRetStatus("000000");
        testOutputVO.setId(testVO.getId());
        return testOutputVO;

    }
    @RequestMapping("/demo1")
    public void demo1(@RequestParam(value = "name", defaultValue = "") String name) throws Exception{
        log.info("删除数据为：{}",name);
        testService.deleteByPrimaryKey(name);
    }
    @RequestMapping("/demo2")
    public void demo2(@RequestBody TestVO testVO) throws Exception{
        log.info("修改数据为：{}",testVO);
        TestDTO testDTO=new TestDTO();
        testDTO.setId(testVO.getId());
        testDTO.setChClientName(testVO.getChClientName());
        testDTO.setCreateTime(testVO.getCreateTime());
        testService.updateByPrimaryKeySelective(testDTO);
    }
    @RequestMapping("/demo3")
    public TestVO demo3(@RequestParam("id") String id) throws Exception{
        log.info("查询数据为：{}",id);
        TestVO testVo=new TestVO();
        TestDTO testDTO=testService.selectByPrimaryKey(id);
        testVo.setId(testDTO.getId());
        testVo.setChClientName(testDTO.getChClientName());
        testVo.setCreateTime(testDTO.getCreateTime());
        return testVo;
    }
}