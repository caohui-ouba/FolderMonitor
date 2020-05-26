package com.oceanbase.foldermonitor.service.impl;

import com.oceanbase.foldermonitor.entity.HostInstance;
import com.oceanbase.foldermonitor.mapper.HostInstanceMapper;
import com.oceanbase.foldermonitor.service.FolderMonitorService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Knox
 * @Date: 2020/5/26 5:03 下午
 * @Description: You Know
 * @Version 1.0
 */
@Service
public class FolderMonitorServiceImpl implements FolderMonitorService {
    @Resource
    private HostInstanceMapper hostInstanceMapper;

    @Override
    public HostInstance getHostByIp(@NonNull String ip) {
        return hostInstanceMapper.getByIp(ip);
    }
}
