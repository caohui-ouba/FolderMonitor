package com.oceanbase.foldermonitor.component.impl;

import com.oceanbase.foldermonitor.component.FolderManager;
import com.oceanbase.foldermonitor.component.FolderRegister;
import com.oceanbase.foldermonitor.exception.PathIsNotDirectoryException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * @Author: Knox
 * @Date: 2020/5/28 12:22 下午
 * @Description: You Know
 * @Version 1.0
 */
@Component
public class IFolderManager implements FolderManager<Path> {

    @Resource
    private FolderRegister<Path> register;

    @Override
    public void register(String absPath) throws Exception {
        //判断是否是目录
        Path path = Paths.get(absPath);
        if (!Files.exists(path)) {
            throw new FileNotFoundException(String.format("找不到目录'%s'", absPath));
        }
        if (!Files.isDirectory(path)) {
            throw new PathIsNotDirectoryException(String.format("路径'%s'不是一个目录", absPath));
        }
        register.register(path);
    }

    @Override
    public int size() {
        return register.size();
    }

    @Override
    public void abandon(String absPath) {
        register.abandon(absPath);
    }

    @Override
    public Path getDir(String absPath) {
        return register.getDir(absPath);
    }

    @Override
    public Iterator<Path> iterator() {
        return register.iterator();
    }
}
