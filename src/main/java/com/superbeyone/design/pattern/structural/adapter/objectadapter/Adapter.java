package com.superbeyone.design.pattern.structural.adapter.objectadapter;


/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Adapter
 * @description
 * @date 2019-10-15 10:16
 **/

public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
