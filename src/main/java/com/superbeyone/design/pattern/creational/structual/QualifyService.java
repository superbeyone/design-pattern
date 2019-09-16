package com.superbeyone.design.pattern.creational.structual;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className QualifyService
 * @description
 * @date 2019-05-27 16:08
 **/

public class QualifyService {

    public boolean isAvaliable(PointGift pointGift) {
        System.out.println("校验" + pointGift.getName() + " 积分通过，库存通过");
        return true;
    }
}
