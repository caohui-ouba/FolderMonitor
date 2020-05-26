package com.oceanbase.foldermonitor.bean.response;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:27 下午
 * @Description: You Know
 * @Version 1.0
 */
public class ResponseFactory {
    public static <T> BaseResponse<T> simpleResponse(int code, String msg) {
        return new BaseResponse<>(code, msg);
    }

    public static <T> BaseResponse<T> responseWithStatus(ResponseStatus status) {
        return new BaseResponse<>(status);
    }

    public static <T> BaseResponse<T> responseWithData(int code, String msg, T data) {
        return new BaseResponse<>(code, msg, data);
    }

    public static <T> BaseResponse<T> responseWithData(ResponseStatus status, T data) {
        return responseWithData(status.getCode(), status.getMsg(), data);
    }
}
