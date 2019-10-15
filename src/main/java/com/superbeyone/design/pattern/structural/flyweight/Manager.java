package com.superbeyone.design.pattern.structural.flyweight;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Manager
 * @description
 * @date 2019-10-15 16:30
 **/

public class Manager implements Employee {


    private String department;

    private String reportContent;


    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
