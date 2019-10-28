package com.kevin.webfluxdemo.config;

import com.kevin.webfluxdemo.sys.pojo.BaseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public BaseResult handleException(Exception e) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(400);
        baseResult.setMsg(e.getMessage());
        return baseResult;
    }
}
