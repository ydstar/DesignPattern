package com.yadong.pattern.factory_method.java_video;

import com.yadong.pattern.factory_method.base.BaseVideo;

/**
 * JavaVideo是继承BaseVideo的
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
