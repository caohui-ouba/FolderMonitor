package com.oceanbase.foldermonitor.bean.response;

import lombok.Data;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:14 下午
 * @Description: You Know
 * @Version 1.0
 */
@Data
public class BaseResponse<T> {
    private int code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(ResponseStatus status) {
        this.code = status.getCode();
        this.msg = status.getMsg();
    }
}
