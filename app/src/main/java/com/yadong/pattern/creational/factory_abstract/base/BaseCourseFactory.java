package com.yadong.pattern.creational.factory_abstract.base;


/**
 * 抽象工厂接口
 */
public interface BaseCourseFactory {
    BaseVideo getVideo();

    BaseNote getNote();
}
