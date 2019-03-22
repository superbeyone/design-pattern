package com.superbeyone.design.pattern.creational.factorymethod;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className PythonVideoFactory
 * @description
 * @date 2019-03-22 16:32
 **/

public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
