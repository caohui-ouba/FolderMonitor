package com.oceanbase.foldermonitor.executor;

import java.nio.file.Path;

/**
 * @Author: Knox
 * @Date: 2020/5/28 12:46 下午
 * @Description: You Know
 * @Version 1.0
 */
public interface FolderSpaceComputer {
    /**
     *
     * @param path 路径
     * @return 字节
     */
    double diskTotalSpace(Path path);
    double diskFreeSpace(Path path);
    double usedSpace(Path path);
    String diskName(Path path);
}
