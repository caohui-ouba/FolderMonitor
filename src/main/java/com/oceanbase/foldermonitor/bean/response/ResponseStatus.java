package com.oceanbase.foldermonitor.bean.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:21 下午
 * @Description: You Know
 * @Version 1.0
 */
@Getter
public enum ResponseStatus {

    SUCCESS(1000, "成功"),
    ERROR(1001,"未知错误"),
    PATH_NOT_EXISTS(1001, "路径不存在");

    private final int code;
    private final String msg;

    ResponseStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
