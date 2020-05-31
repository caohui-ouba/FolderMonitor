package com.oceanbase.foldermonitor.component;

/**
 * @Author: Knox
 * @Date: 2020/5/27 11:06 上午
 * @Description: You Know
 * @Version 1.0
 */
public interface FolderRegister<T>  extends Iterable<T>{
    void register(T dirPath);

    int size();

    void abandon(String absPath);

    T getDir(String absPath);
}
