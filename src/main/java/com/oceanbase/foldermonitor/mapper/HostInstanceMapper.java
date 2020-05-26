package com.oceanbase.foldermonitor.mapper;

import com.oceanbase.foldermonitor.entity.HostInstance;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Knox
 * @Date: 2020/5/26 3:56 下午
 * @Description: You Know
 * @Version 1.0
 */
@Mapper
public interface HostInstanceMapper {

    HostInstance getByIp(String ip);
}
