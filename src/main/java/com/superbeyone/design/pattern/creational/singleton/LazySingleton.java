package com.superbeyone.design.pattern.creational.singleton;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className LazySingleton
 * @description 懒汉式
 * @date 2019-05-15 12:10
 **/

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
