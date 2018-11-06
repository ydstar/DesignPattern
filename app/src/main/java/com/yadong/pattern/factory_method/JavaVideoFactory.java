package com.yadong.pattern.factory_method;

public class JavaVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
