package com.oceanbase.foldermonitor.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Knox
 * @Date: 2020/5/27 11:20 上午
 * @Description: You Know
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FolderInfoVO {
    private String folderName;
    private String abPath;
    private long useCapacity;
    private String diskName;
    private long diskCapacity;
    private long diskUseCapacity;
}
