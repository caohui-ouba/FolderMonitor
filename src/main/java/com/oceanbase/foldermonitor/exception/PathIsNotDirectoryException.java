package com.oceanbase.foldermonitor.exception;

/**
 * @Author: Knox
 * @Date: 2020/5/28 12:42 下午
 * @Description: You Know
 * @Version 1.0
 */
public class PathIsNotDirectoryException extends RuntimeException {
    public PathIsNotDirectoryException() {
    }

    public PathIsNotDirectoryException(String msg) {
        super(msg);
    }
}
