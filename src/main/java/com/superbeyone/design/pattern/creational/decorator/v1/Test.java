package com.superbeyone.design.pattern.creational.decorator.v1;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description
 * @date 2019-05-31 09:48
 **/

public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "\t" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "\t" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + "\t" + battercakeWithEggSausage.cost());

    }
}
