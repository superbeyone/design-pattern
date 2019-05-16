package com.superbeyone.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className HungrySingleton
 * @description 饿汉式
 * @date 2019-05-15 12:38
 **/

public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
