package com.yadong.pattern.creational.factory_method.base;


/**
 * 步骤1:创建抽象工厂类,定义具体工厂的公共接口
 */
public interface Factory {
    VideoProduct getVideo();
}
