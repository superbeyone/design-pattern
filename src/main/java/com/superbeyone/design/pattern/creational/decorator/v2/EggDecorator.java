package com.superbeyone.design.pattern.creational.decorator.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className EggDecorator
 * @description
 * @date 2019-05-31 10:03
 **/

public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {
        System.out.println("鸡蛋装饰者处理部分");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
