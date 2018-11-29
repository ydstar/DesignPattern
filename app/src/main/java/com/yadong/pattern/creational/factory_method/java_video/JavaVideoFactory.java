package com.yadong.pattern.creational.factory_method.java_video;

import com.yadong.pattern.creational.factory_method.base.VideoProduct;
import com.yadong.pattern.creational.factory_method.base.Factory;

/**
 * 步骤4：创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
 * JavaVideo的工厂类实现BaseVideoFactory接口,延迟到子类中来创建具体的对象
 * 总而言之就是,什么工厂创建什么对象,JavaVideoFactory工厂就创建JavaVideo
 */
public class JavaVideoFactory implements Factory {

    /**
     * 工厂方法
     */
    @Override
    public VideoProduct getVideo() {
        return new JavaVideo();
    }
}
