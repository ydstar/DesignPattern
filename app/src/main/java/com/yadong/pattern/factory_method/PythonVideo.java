package com.yadong.pattern.factory_method;

/**
 * PythonVideo是继承BaseVideo的
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
