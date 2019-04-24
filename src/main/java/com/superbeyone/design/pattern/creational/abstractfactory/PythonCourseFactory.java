package com.superbeyone.design.pattern.creational.abstractfactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className PythonCourseFactory
 * @description
 * @date 2019-04-23 16:08
 **/

public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        System.out.println("llal");
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
