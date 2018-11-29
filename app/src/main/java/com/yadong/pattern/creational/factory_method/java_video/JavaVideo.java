package com.yadong.pattern.creational.factory_method.java_video;

import com.yadong.pattern.creational.factory_method.base.VideoProduct;

/**
 * 步骤3:创建具体产品类（继承抽象产品类),定义生产的具体产品；
 * JavaVideo是继承BaseVideo的
 */
public class JavaVideo extends VideoProduct {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
