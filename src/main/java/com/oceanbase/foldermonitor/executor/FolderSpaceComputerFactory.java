package com.oceanbase.foldermonitor.executor;

import com.oceanbase.foldermonitor.exception.NotSupportedOSTypeException;
import com.oceanbase.foldermonitor.executor.system.MacOSXFolderSpaceComputer;
import com.oceanbase.foldermonitor.util.SpringCtxBeanUtil;
import lombok.Getter;

/**
 * @Author: Knox
 * @Date: 2020/5/28 12:54 下午
 * @Description: You Know
 * @Version 1.0
 */
public class FolderSpaceComputerFactory {

    private static final String OS_PROPERTY_NAME = "os.name";

    public static FolderSpaceComputer getInstance() {
        return OSType.getSpaceComputer(System.getProperty(OS_PROPERTY_NAME));
    }
}

@Getter
enum OSType {
    MAC_OS_X("Mac OS X", SpringCtxBeanUtil.getBean(MacOSXFolderSpaceComputer.class));
    private final String name;
    private final FolderSpaceComputer computer;

    OSType(String name, FolderSpaceComputer computer) {
        this.name = name;
        this.computer = computer;
    }

    public static FolderSpaceComputer getSpaceComputer(String os) {
        for (int i = 0; i < values().length; i++) {
            if (os.equalsIgnoreCase(values()[i].name)) {
                return values()[i].computer;
            }
        }
        throw new NotSupportedOSTypeException(String.format("FolderSpaceComputer不支持'%s'系统", os));
    }
}