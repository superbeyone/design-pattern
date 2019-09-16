package com.superbeyone.design.pattern.creational.structual;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className ShippingService
 * @description
 * @date 2019-05-27 16:35
 **/

public class ShippingService {
    public String shipGift(PointGift pointGift) {
        System.out.println(pointGift.getName() + "进入物流系统");

        return System.currentTimeMillis() + "";
    }
}
