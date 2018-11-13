package com.yadong.pattern.factory_abstract.python_course;

import com.yadong.pattern.factory_abstract.BaseArticle;

/**
 *
 */
public class PythonArticle extends BaseArticle {
    @Override
    public void produce() {
        System.out.println("编写Python课程手册");
    }
}
