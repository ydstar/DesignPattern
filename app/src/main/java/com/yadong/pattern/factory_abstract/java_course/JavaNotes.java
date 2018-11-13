package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.BaseNotes;

/**
 *
 */
public class JavaNotes extends BaseNotes {
    @Override
    public void produce() {
        System.out.println("编写Java课程笔记");
    }
}
