package com.yadong.pattern.factory;

public class SendFactory {


    public static Sender product(String type) {

        switch (type) {
            case "mail":
                return new MailSender();

            case "sms":
                return new SmsSender();

            default:
                System.out.println("不存在");
                return null;
        }

    }
}
