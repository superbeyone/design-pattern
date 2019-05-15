package com.superbeyone.design.pattern.creational.builder.v2;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description
 * @date 2019-04-24 10:38
 **/

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildName("Java name")
                .buildVideo("Java Video")
                .buildPPT("Java PPT")
                .buildArticle("Java Article").build();
        System.out.println(course);
    }
}
