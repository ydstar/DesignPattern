package com.yadong.pattern.creational.factory_abstract.base;


/**
 * 步骤1：创建抽象工厂类，定义具体工厂的公共接口
 * 抽象工厂接口
 */
public interface BaseCourseFactory {
    BaseVideo getVideo();

    BaseNote getNote();
}
