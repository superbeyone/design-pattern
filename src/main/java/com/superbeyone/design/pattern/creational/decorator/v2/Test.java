package com.superbeyone.design.pattern.creational.decorator.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 装饰者模式
 * @date 2019-05-31 10:07
 **/

public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + "\t" + aBattercake.cost());

    }
}
