package com.superbeyone.design.pattern.creational.structual;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className GiftExchangeService
 * @description
 * @date 2019-05-27 16:37
 **/

public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift) {

        if (qualifyService.isAvaliable(pointGift)) {
            if (pointPaymentService.pay(pointGift)) {
                String shipNo = shippingService.shipGift(pointGift);
                System.out.println("物流订单编号：\t" + shipNo);
            }
        }
    }
}
