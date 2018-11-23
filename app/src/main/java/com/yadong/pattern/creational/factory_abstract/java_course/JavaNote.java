package com.yadong.pattern.creational.factory_abstract.java_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseNote;

/**
 * Java笔记对象
 */
public class JavaNote extends BaseNote {
    @Override
    public void produce() {
        System.out.println("编写Java课程笔记");
    }
}
