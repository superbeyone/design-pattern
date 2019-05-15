package com.superbeyone.design.pattern.creational.builder;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className CourseActualBuilder
 * @description
 * @date 2019-04-24 10:05
 **/

public class CourseActualBuilder implements CourseBuilder {

    private Course course = new Course();


    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public void buildPPT(String ppt) {
        course.setPpt(ppt);
    }

    @Override
    public void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public void buildQA(String qa) {
        course.setQa(qa);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
