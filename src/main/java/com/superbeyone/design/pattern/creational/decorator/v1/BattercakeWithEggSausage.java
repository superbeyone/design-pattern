package com.superbeyone.design.pattern.creational.decorator.v1;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className BattercakeWithEggSausage
 * @description
 * @date 2019-05-31 09:47
 **/

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
