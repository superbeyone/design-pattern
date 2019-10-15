package com.superbeyone.design.pattern.structural.adapter.objectadapter;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Adaptee
 * @description 适配器模式，通过类适配
 * @date 2019-10-15 10:11
 **/

public class Adaptee extends Adapter {
    public void adapteeRequest(){
        System.out.println("被适配者的方法");
    }
}
