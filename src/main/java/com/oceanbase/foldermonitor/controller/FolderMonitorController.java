package com.oceanbase.foldermonitor.controller;

import com.oceanbase.foldermonitor.bean.response.BaseResponse;
import com.oceanbase.foldermonitor.bean.response.ResponseFactory;
import com.oceanbase.foldermonitor.bean.response.ResponseStatus;
import com.oceanbase.foldermonitor.entity.HostInstance;
import com.oceanbase.foldermonitor.service.FolderMonitorService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:44 下午
 * @Description: You Know
 * @Version 1.0
 */
@RestController
public class FolderMonitorController {

    @Resource
    private FolderMonitorService folderMonitorService;

    @GetMapping("/getHost")
    public BaseResponse<HostInstance> getHost() {
        return ResponseFactory.responseWithData(ResponseStatus.SUCCESS, folderMonitorService.getHostByIp("127.0.0.1"));
    }

    @GetMapping("/test")
    public BaseResponse<Object> test() {
        return ResponseFactory.responseWithStatus(ResponseStatus.SUCCESS);
    }
}
