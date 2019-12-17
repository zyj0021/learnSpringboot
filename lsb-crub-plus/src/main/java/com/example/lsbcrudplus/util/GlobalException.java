package com.example.lsbcrudplus.util;

import com.example.lsbcrudplus.emum.ResultEnum;
import com.example.lsbcrudplus.util.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.invoke.LambdaConversionException;

/**
 * @Description: 全局的异常返回
 * @Author: boolean
 * @Date: 2019/12/10 0:14
 */
@RestControllerAdvice
public class GlobalException {

    // 拦截器
    @ExceptionHandler({Exception.class})
    public Result exception(Exception e){
        Result result = new Result();
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMsg(ResultEnum.ERROR.getMsg());
        result.setDate(e.getMessage());
        return result;
    }


}


