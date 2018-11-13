package com.yadong.pattern.factory_abstract.python_course;

import com.yadong.pattern.factory_abstract.base.BaseNote;

/**
 * Python笔记对象
 */
public class PythonNote extends BaseNote {
    @Override
    public void produce() {
        System.out.println("编写Python课程笔记");
    }
}
