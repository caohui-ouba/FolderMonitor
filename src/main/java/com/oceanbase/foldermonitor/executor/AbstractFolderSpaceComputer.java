package com.oceanbase.foldermonitor.executor;

import lombok.Getter;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**
 * @Author: Knox
 * @Date: 2020/5/31 11:41 上午
 * @Description: You Know
 * @Version 1.0
 */
public abstract class AbstractFolderSpaceComputer implements FolderSpaceComputer {
    @Getter
    private final String normalDirSpaceInstruction = "du -s %s | awk '{print $1}'";


    @Override
    public double usedSpace(Path path) {
        try {
            ProcessBuilder builder = new ProcessBuilder("/bin/sh", "-c",
                    String.format(getNormalDirSpaceInstruction(), path.toFile().getAbsolutePath()));
            Process process = builder.start();
            return Double.parseDouble(StreamUtils.copyToString(process.getInputStream(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public double diskFreeSpace(Path path) {
        return 0;
    }

    @Override
    public String diskName(Path path) {
        return null;
    }

    @Override
    public double diskTotalSpace(Path path) {
        return 0;
    }
}
