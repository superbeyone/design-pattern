package com.superbeyone.design.pattern.creational.structual;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 外观模式
 * @date 2019-05-27 16:40
 **/

public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("运动鞋");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointGift);
    }
}
