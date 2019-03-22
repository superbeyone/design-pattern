package com.superbeyone.design.principle.dependenceinversion;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 依赖倒置原则
 * @date 2019-03-15 17:10
 **/

public class Test {
    public static void main(String[] args) {
        System.out.println("----------- v1 -------------");
        Tom tom = new Tom();
        tom.wantToStudy(new JavaCourse());
        tom.wantToStudy(new PythonCourse());
        tom.wantToStudy(new SparkCourse());
        System.out.println("----------- v2 ----------");
        Tom tom1 = new Tom(new JavaCourse());
        tom1.wantToStudy();
        System.out.println("----------- v3 ----------");
        Tom tom2 = new Tom();
        tom2.setCourse(new JavaCourse());
        tom2.wantToStudy();
        tom2.setCourse(new PythonCourse());
        tom2.wantToStudy();
    }
}
