package com.superbeyone.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className ContainerSingleton
 * @description 容器型单例
 * @date 2019-05-16 15:37
 **/

public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> singletonMap = new ConcurrentHashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
