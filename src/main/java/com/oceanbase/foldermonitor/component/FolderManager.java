package com.oceanbase.foldermonitor.component;

/**
 * @Author: Knox
 * @Date: 2020/5/27 11:06 上午
 * @Description: You Know
 * @Version 1.0
 */
public interface FolderManager<T> extends Iterable<T> {

    void register(String absPath)throws Exception;

    int size();

    void abandon(String absPath);

    T getDir(String absPath);
}
