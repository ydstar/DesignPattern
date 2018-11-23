package com.yadong.pattern.creational.factory_abstract.java_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseVideo;

/**
 * Java录像对象
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("生产Java课程视频");
    }
}
