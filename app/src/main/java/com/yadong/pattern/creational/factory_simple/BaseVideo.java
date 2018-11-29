package com.yadong.pattern.creational.factory_simple;

/**
 * 步骤1.创建抽象产品类,定义具体产品的公共接口
 * 抽象类BaseVideo,让具体的子类去继承
 */
public abstract class BaseVideo {
    public abstract void produce();
}
