package com.oceanbase.foldermonitor.exception;

/**
 * @Author: Knox
 * @Date: 2020/5/28 1:22 下午
 * @Description: You Know
 * @Version 1.0
 */
public class NotSupportedOSTypeException extends RuntimeException {
    public NotSupportedOSTypeException() {
    }

    public NotSupportedOSTypeException(String msg) {
        super(msg);
    }
}
