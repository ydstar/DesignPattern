package com.yadong.pattern.factory_abstract.java_course;

import com.yadong.pattern.factory_abstract.BaseArticle;

/**
 *
 */
public class JavaArticle extends BaseArticle {
    @Override
    public void produce() {
        System.out.println("编写Java课程手册");
    }
}
