package com.superbeyone.design.pattern.creational.abstractfactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description
 * @date 2019-04-23 16:42
 **/

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Article article = factory.getArticle();
        article.produce();
        Video video = factory.getVideo();
        video.produce();

    }
}
