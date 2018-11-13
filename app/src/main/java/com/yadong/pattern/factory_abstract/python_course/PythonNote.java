package com.yadong.pattern.factory_abstract.python_course;

import com.yadong.pattern.factory_abstract.base.BaseNote;

/**
 *
 */
public class PythonNote extends BaseNote {
    @Override
    public void produce() {
        System.out.println("编写Python课程笔记");
    }
}
