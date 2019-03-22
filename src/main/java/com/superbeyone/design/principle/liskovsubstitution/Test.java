package com.superbeyone.design.principle.liskovsubstitution;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 里氏转换
 * @date 2019-03-19 09:07
 **/

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(15);
        resize(rectangle);

    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
        }
        System.out.println("resize 方法结束 width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
    }
}
