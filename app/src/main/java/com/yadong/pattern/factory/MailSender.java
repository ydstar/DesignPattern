package com.yadong.pattern.factory;

public class MailSender implements Sender {

    @Override
    public void send(String message) {
        System.out.print("mail: "+message);
    }
}
