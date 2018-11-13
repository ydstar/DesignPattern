package com.yadong.pattern.factory_method;

/**
 * JavaVideo是继承BaseVideo的
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
