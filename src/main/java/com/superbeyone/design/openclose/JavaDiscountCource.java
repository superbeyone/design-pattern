package com.superbeyone.design.openclose;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaDiscountCource
 * @description JavaCourse扩展类
 * @date 2019-03-15 16:13
 **/

public class JavaDiscountCource extends JavaCourse {
    public JavaDiscountCource(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
