package com.yadong.pattern.creational.factory_abstract.python_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseVideo;

/**
 * Python录像对象
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("生产Python课程视频");
    }
}
