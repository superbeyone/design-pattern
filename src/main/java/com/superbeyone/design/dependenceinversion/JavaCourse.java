package com.superbeyone.design.dependenceinversion;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaCourse
 * @description JavaCourse
 * @date 2019-03-15 17:08
 **/

public class JavaCourse implements Course {

    @Override
    public void study() {
        System.out.println("学习java课程");
    }
}
