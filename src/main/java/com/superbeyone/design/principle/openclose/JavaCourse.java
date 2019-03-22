package com.superbeyone.design.principle.openclose;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className JavaCourse
 * @description Java Course
 * @date 2019-03-15 16:04
 **/

public class JavaCourse implements Course {

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
