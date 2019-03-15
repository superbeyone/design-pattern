package com.superbeyone.design.dependenceinversion;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className PythonCourse
 * @description PythonCourse
 * @date 2019-03-15 17:08
 **/

public class PythonCourse implements Course {

    @Override
    public void study() {
        System.out.println("学习Python课程");
    }
}
