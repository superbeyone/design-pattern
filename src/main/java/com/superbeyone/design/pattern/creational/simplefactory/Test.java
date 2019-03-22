package com.superbeyone.design.pattern.creational.simplefactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 简单工厂
 * @date 2019-03-22 14:44
 **/

public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideo1("java");
//        if (null != video) {
//            video.produce();
//        }


        System.out.println("-------------------");

        Video video2 = factory.getVideo2(JavaVideo.class);
        if (null != video2) {
            video2.produce();
        }
    }
}
