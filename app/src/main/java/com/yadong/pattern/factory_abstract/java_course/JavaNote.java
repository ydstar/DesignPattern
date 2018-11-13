package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.BaseNote;

/**
 *
 */
public class JavaNote extends BaseNote {
    @Override
    public void produce() {
        System.out.println("编写Java课程笔记");
    }
}
