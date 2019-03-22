package com.superbeyone.design.pattern.creational.factorymethod;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaVideoFactory
 * @description
 * @date 2019-03-22 16:31
 **/

public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
