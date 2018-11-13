package com.yadong.pattern.factory_method;

/**
 * JavaVideo的工厂类实现VideoFactory接口,延迟到子类中来创建具体的对象
 * 总而言之就是,什么工厂创建什么对象,JavaVideoFactory工厂就创建JavaVideo
 */
public class JavaVideoFactory implements VideoFactory {

    /**
     * 工厂方法
     */
    @Override
    public BaseVideo getVideo() {
        return new JavaVideo();
    }
}
