package com.superbeyone.design.pattern.creational.singleton;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className StaticInnerClassSingleton
 * @description 静态内部类单例模式
 * @date 2019-05-15 12:29
 **/

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
