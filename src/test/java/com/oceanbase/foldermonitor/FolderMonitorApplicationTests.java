package com.oceanbase.foldermonitor;

import com.oceanbase.foldermonitor.service.FolderMonitorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class FolderMonitorApplicationTests {
    @Resource
    private FolderMonitorService folderMonitorService;

    @Test
    void contextLoads() {
        System.out.println(folderMonitorService.getHostByIp("127.0.0.1"));
    }

}
