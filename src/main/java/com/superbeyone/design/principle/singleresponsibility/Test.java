package com.superbeyone.design.principle.singleresponsibility;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 单一职责原则
 * @date 2019-03-18 10:45
 **/

public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("企鹅");

    }
}
