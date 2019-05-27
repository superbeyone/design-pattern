package com.superbeyone.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className MailUtil
 * @description
 * @date 2019-05-16 16:13
 **/

public class MailUtil {
    public static void sendMail(Mail mail) {
        String content = "向 {0} 同学的邮件地址 {1} 发送邮件，内容为: {2}";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储原始邮件记录，" + mail.getContent());
    }

}
