package com.superbeyone.design.pattern.creational.prototype;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 原型模型测试类
 * @date 2019-05-20 09:44
 **/

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@qq.com");
            mailTemp.setContent("恭喜:姓名" + i + "中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
