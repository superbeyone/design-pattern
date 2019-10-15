package com.superbeyone.design.pattern.structural.adapter.classadapter;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 适配器模式 通过类适配
 * @date 2019-10-15 10:17
 **/

public class Test {

    public static void main(String[] args) {
       Target target = new ConcreteTarget();
       target.request();

       Target adapterTarget = new Adapter();
       adapterTarget.request();

    }
}
