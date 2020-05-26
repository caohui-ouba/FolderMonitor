package com.oceanbase.foldermonitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oceanbase.foldermonitor.mapper")
public class FolderMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FolderMonitorApplication.class, args);
    }
}
