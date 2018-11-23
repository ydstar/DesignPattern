package com.yadong.pattern.creational.factory_method.python_video;

import com.yadong.pattern.creational.factory_method.base.BaseVideo;

/**
 * PythonVideo是继承BaseVideo的
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
