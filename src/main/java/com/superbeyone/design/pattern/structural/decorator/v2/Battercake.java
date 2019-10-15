package com.superbeyone.design.pattern.structural.decorator.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className BatterCake
 * @description
 * @date 2019-05-31 09:42
 **/

public class Battercake implements ABattercake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 10;
    }
}
