package com.superbeyone.design.pattern.creational.prototype.abstractprototype;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className A
 * @description
 * @date 2019-05-27 08:48
 **/

public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
