package com.superbeyone.design.pattern.structural.adapter.objectadapter;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className ConcreteTarget
 * @description
 * @date 2019-10-15 10:14
 **/

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
