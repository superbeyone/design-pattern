package com.superbeyone.design.pattern.creational.abstractfactory;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className CourseFactory
 * @description 课程工厂
 * @date 2019-04-23 11:04
 **/

public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
