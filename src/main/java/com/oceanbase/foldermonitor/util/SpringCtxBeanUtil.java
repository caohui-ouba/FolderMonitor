package com.oceanbase.foldermonitor.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: Knox
 * @Date: 2020/5/28 1:05 下午
 * @Description: You Know
 * @Version 1.0
 */
@SuppressWarnings("unchecked")
public class SpringCtxBeanUtil implements ApplicationContextAware {

    private static ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return ctx.getBean(clazz);
    }

    public static <T> T getBean(String beanId) {
        return (T) ctx.getBean(beanId);
    }

}
