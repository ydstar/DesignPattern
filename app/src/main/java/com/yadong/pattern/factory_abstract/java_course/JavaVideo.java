package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.base.BaseVideo;

/**
 *
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("生产Java课程视频");
    }
}
