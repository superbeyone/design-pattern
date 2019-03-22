package com.superbeyone.design.pattern.creational.factorymethod;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 简单工厂
 * @date 2019-03-22 14:44
 **/

public class Test {
    public static void main(String[] args) {

        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideoFactoryVideo = javaVideoFactory.getVideo();
        javaVideoFactoryVideo.produce();
        System.out.println("----------------------");
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video pythonVideoFactoryVideo = pythonVideoFactory.getVideo();
        pythonVideoFactoryVideo.produce();

    }
}
