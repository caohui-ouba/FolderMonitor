package com.oceanbase.foldermonitor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:06 下午
 * @Description: You Know
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disk {
    private int diskId;
    private String diskName;
    private double diskCapacity;
    private double diskRemain;
    private String mountedPath;
}
