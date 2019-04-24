package com.superbeyone.design.pattern.creational.abstractfactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaCourseFactory
 * @description
 * @date 2019-04-23 11:09
 **/

public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
