package com.superbeyone.design.pattern.structural.flyweight;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 享元模式
 * @date 2019-10-15 16:37
 **/

public class Test {

    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            String department = departments[(int) (Math.random() * departments.length)];

            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
