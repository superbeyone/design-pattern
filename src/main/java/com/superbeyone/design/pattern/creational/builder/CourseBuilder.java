package com.superbeyone.design.pattern.creational.builder;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className CourseBuilder
 * @description
 * @date 2019-04-24 10:02
 **/

public interface CourseBuilder {

    void buildName(String name);

    void buildPPT(String ppt);

    void buildVideo(String video);

    void buildArticle(String article);

    void buildQA(String qa);

    Course makeCourse();

}
