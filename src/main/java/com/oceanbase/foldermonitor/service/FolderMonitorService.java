package com.oceanbase.foldermonitor.service;

import com.oceanbase.foldermonitor.entity.HostInstance;
import lombok.NonNull;

/**
 * @Author: Knox
 * @Date: 2020/5/26 5:02 下午
 * @Description: You Know
 * @Version 1.0
 */
public interface FolderMonitorService {
     HostInstance getHostByIp(@NonNull String ip);
}
