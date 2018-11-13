package com.yadong.pattern.factory_abstract.base;


/**
 * 抽象工厂接口
 */
public interface BaseCourseFactory {
    BaseVideo getVideo();

    BaseNote getNote();
}
