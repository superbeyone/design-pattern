package com.superbeyone.design.pattern.creational.structual;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className PointPaymentService
 * @description
 * @date 2019-05-27 16:30
 **/

public class PointPaymentService {

    public boolean pay(PointGift pointGift) {
        System.out.println("支付" + pointGift.getName() + "成功");
        return true;
    }
}
