package com.yadong.pattern.creational.factory_abstract.java_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseVideo;

/**
 * 步骤3： 创建具体产品类（继承抽象产品类）， 定义生产的具体产品；
 * Java录像对象
 */
public class JavaVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("生产Java课程视频");
    }
}
