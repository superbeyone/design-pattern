package com.superbeyone.design.pattern.creational.decorator.v1;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className BattercakeWithEgg
 * @description
 * @date 2019-05-31 09:45
 **/

public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加个蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
