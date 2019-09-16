package com.superbeyone.design.pattern.creational.decorator.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className SausageDecorator
 * @description
 * @date 2019-05-31 10:05
 **/

public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {
        System.out.println("香肠装饰者处理部分");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
