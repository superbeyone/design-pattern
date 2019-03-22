package com.superbeyone.design.principle.demeter;

import java.util.ArrayList;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className TeamLeader
 * @description
 * @date 2019-03-18 16:38
 **/

public class TeamLeader {
    public void checkNumOfCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("course num is " + courses.size());
    }
}
