package com.superbeyone.design.dependenceinversion;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className SparkCourse
 * @description SparkCourse
 * @date 2019-03-15 17:09
 **/

public class SparkCourse implements Course {

    @Override
    public void study() {
        System.out.println("学习Spark课程");
    }
}
