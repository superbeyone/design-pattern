package com.superbeyone.design.pattern.structural.adapter.classadapter;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Adapter
 * @description
 * @date 2019-10-15 10:16
 **/

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
