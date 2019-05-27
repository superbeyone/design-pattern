package com.superbeyone.design.pattern.creational.prototype;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Mail
 * @description
 * @date 2019-05-16 16:10
 **/

public class Mail implements Cloneable {

    private String name;

    private String emailAddress;

    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail test");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
