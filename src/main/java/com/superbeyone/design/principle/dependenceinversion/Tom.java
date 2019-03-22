package com.superbeyone.design.principle.dependenceinversion;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Tom
 * @description Tom
 * @date 2019-03-15 17:10
 **/

public class Tom {

    private Course course;

    public Tom(Course course) {
        this.course = course;
    }

    public Tom() {
    }

    public void wantToStudy(Course course) {
        course.study();
    }

    public void wantToStudy() {
        course.study();
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
