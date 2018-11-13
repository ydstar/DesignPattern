package com.yadong.pattern.factory_abstract.python_course;

import com.yadong.pattern.factory_abstract.BaseVideo;

/**
 *
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("生产Java课程视频");
    }
}
