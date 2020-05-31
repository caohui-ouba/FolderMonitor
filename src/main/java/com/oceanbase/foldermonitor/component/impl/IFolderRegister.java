package com.oceanbase.foldermonitor.component.impl;

import com.oceanbase.foldermonitor.component.FolderRegister;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Knox
 * @Date: 2020/5/27 11:09 上午
 * @Description: You Know
 * @Version 1.0
 */
@Component
public class IFolderRegister implements FolderRegister<Path> {

    private static final Map<String, Path> PATHS = new ConcurrentHashMap<>();

    @Override
    public void register(Path dirPath) {
        PATHS.put(dirPath.toFile().getAbsolutePath(), dirPath);
    }

    @Override
    public int size() {
        return PATHS.size();
    }

    @Override
    public void abandon(String absPath) {
        PATHS.remove(absPath);
    }

    @Override
    public Path getDir(String absPath) {
        return PATHS.get(absPath);
    }


    @Override
    public Iterator<Path> iterator() {
        return PATHS.values().iterator();
    }
}
