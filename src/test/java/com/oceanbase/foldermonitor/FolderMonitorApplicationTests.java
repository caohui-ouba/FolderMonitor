package com.oceanbase.foldermonitor;

import com.oceanbase.foldermonitor.executor.system.MacOSXFolderSpaceComputer;
import com.oceanbase.foldermonitor.service.FolderMonitorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.nio.file.Paths;

@SpringBootTest
class FolderMonitorApplicationTests {
    @Resource
    private FolderMonitorService folderMonitorService;

    @Resource
    private MacOSXFolderSpaceComputer folderSpaceComputer;
    @Test
    void contextLoads() {
        System.out.println(folderMonitorService.getHostByIp("127.0.0.1"));
    }

    @Test
    void testSpaceComputer(){
        double v = folderSpaceComputer.usedSpace(Paths.get("/Users/hui/caohui"));
        System.out.println(v);

    }
}
