package com.superbeyone.design.pattern.creational.builder;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Coach
 * @description
 * @date 2019-04-24 10:10
 **/

public class Coach {
    private CourseBuilder courseBuilder;


    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String ppt, String video, String article, String qa) {
        this.courseBuilder.buildName(name);
        this.courseBuilder.buildPPT(ppt);
        this.courseBuilder.buildVideo(video);
        this.courseBuilder.buildArticle(article);
        this.courseBuilder.buildQA(qa);
        return this.courseBuilder.makeCourse();
    }
}
