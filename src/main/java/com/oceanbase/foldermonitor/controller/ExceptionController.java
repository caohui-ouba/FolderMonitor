package com.oceanbase.foldermonitor.controller;

import com.oceanbase.foldermonitor.bean.response.BaseResponse;
import com.oceanbase.foldermonitor.bean.response.ResponseFactory;
import com.oceanbase.foldermonitor.bean.response.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:12 下午
 * @Description: You Know
 * @Version 1.0
 */
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    public BaseResponse<Object> responseError(Exception exception) {
        return ResponseFactory.simpleResponse(ResponseStatus.ERROR.getCode(), exception.getMessage());
    }
}
