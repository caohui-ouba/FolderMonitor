package com.oceanbase.foldermonitor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:02 下午
 * @Description: You Know
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HostInstance {
    private String hostIp;
    private String hostName;
    private int diskCnt;
}
