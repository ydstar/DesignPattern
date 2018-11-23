package com.yadong.pattern.creational.factory_method.java_video;

import com.yadong.pattern.creational.factory_method.base.BaseVideo;

/**
 * JavaVideo是继承BaseVideo的
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
