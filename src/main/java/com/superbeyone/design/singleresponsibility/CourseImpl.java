package com.superbeyone.design.singleresponsibility;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className CourseImpl
 * @description
 * @date 2019-03-18 10:56
 **/

public class CourseImpl implements CourseManager, CourseContent {

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getcourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
