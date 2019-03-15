package com.superbeyone.design.openclose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description
 * @date 2019-03-15 16:06
 **/

public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        Course javaCourse = new JavaDiscountCource(92, "Java从入门到放弃", 100d);

        logger.info("编号：{},课程名称：{},原售价格：{},现售价格{}", javaCourse.getId(), javaCourse.getName(), ((JavaDiscountCource) javaCourse).getOriginPrice(), javaCourse.getPrice());
    }
}
