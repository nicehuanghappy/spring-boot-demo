package com.bob.demo2.exception;

import com.bob.bole.halo.exception.api.IExceptionToReturn;
import com.bob.bole.halo.exception.exceptions.BusinessException;
import com.bob.demo2.dto.Result;
import org.springframework.stereotype.Component;

/**
 * ExceptionToReturn class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/7
 */
@Component
public class ExceptionToReturn implements IExceptionToReturn {
    @Override
    public Object translateExceptionToReturn(Throwable ex){
        Result result=new Result();
        if(ex instanceof BusinessException){
            result.setReturnCode(((BusinessException) ex).getErrorCode());
            result.setReturnMessage(((BusinessException) ex).getErrorMessage());
        }else{
            result.setReturnCode("999999");
            result.setReturnMessage("未知异常1");
        }
        return result;
    }
}