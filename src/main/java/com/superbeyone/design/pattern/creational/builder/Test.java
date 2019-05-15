package com.superbeyone.design.pattern.creational.builder;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 建造者模式
 * @date 2019-04-24 10:15
 **/

public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();

        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java 课程", "Java PPT", "Java Video", "Java Article", "Java QA");

        System.out.println(course);
    }
}
