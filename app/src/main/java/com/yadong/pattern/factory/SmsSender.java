package com.yadong.pattern.factory;

public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("sms:" + message);
    }

}
