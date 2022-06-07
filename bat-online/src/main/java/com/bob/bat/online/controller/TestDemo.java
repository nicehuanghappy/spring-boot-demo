package com.bob.bat.online.controller;

import com.alibaba.fastjson.JSONObject;
import com.bob.bat.common.ResultDto;
import com.bob.bat.online.dto.TestDemoInputDto;
import com.bob.bat.online.service.TestCurdDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestController class
 * description: 增删改查demo
 *
 * @author majiangwei
 * @date 2022/5/5
 */
@RestController
@Slf4j
public class TestDemo {
    @Resource
    private TestCurdDemo testCurdDemo;
    @PostMapping(value = "/com/bob/bat/insert")
    public ResultDto<String> process(@RequestBody TestDemoInputDto testDemoInputDto){
        if (log.isDebugEnabled()) {
            log.debug("上传http体{}", JSONObject.toJSONString(testDemoInputDto));
        }
        int rowNum = testCurdDemo.insert(testDemoInputDto);
        if (log.isDebugEnabled()) {
            log.debug("受影响的行数:{}", rowNum);
        }
        return ResultDto.success();
    }
}