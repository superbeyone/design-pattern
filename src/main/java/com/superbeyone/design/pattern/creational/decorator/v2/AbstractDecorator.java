package com.superbeyone.design.pattern.creational.decorator.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className AbstractDecorator
 * @description
 * @date 2019-05-31 10:01
 **/

public abstract class AbstractDecorator implements ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    public String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBattercake.cost();
    }
}
