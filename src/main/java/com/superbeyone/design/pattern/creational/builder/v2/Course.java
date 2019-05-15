package com.superbeyone.design.pattern.creational.builder.v2;

import lombok.Data;
import lombok.ToString;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Course
 * @description
 * @date 2019-04-24 09:59
 **/
@Data
@ToString
public class Course {

    private String name;

    private String ppt;

    private String video;

    private String article;

    private String qa;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.ppt = courseBuilder.ppt;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.qa = courseBuilder.qa;
    }

    public static class CourseBuilder {
        private String name;

        private String ppt;

        private String video;

        private String article;

        private String qa;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildPPT(String ppt) {
            this.ppt = ppt;
            return this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder buildArticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder buildQA(String qa) {
            this.qa = qa;
            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }
}
