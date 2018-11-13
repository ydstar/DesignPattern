package com.yadong.pattern.factory_abstract;


/**
 * 抽象工厂接口
 */
public interface CourseFactory {
    BaseVideo getVideo();

    BaseNotes getNotes();
}
