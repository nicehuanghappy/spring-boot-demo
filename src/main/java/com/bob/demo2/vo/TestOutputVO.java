package com.bob.demo2.vo;

import com.bob.bole.bums.api.model.IBaseResponse;
import com.bob.bole.bums.api.model.head.HeadOut;
import com.bob.bole.bums.api.model.head.IHeadOut;
import lombok.Data;

/**
 * TestOutputVO class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/7
 */
@Data
public class TestOutputVO implements IBaseResponse {
    private String id;
    private String chClientName;
    private String createTime;
    private HeadOut headOut;
    public TestOutputVO(HeadOut headOut){
        this.headOut=headOut;
    }
    public  TestOutputVO(){
        this.headOut=new HeadOut();
    }
    @Override
    public IHeadOut getHead(){
        return  headOut;
    }
    @Override
    public void  setHead(IHeadOut head){
        this.headOut=(HeadOut)head;
    }
}