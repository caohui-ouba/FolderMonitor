package com.oceanbase.foldermonitor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:08 下午
 * @Description: You Know
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Folder {
    private int folderId;
    private String folderName;
    private String absolutePath;
    private int diskId;
}
