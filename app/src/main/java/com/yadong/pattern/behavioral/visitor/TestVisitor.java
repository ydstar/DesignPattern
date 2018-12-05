package com.yadong.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 * 定义:封装作用于某数据结构(比如List,Set,Map等)中的个元素的操作
 * 特征:可以在不改变个元素的类的前提下,定义作用于这些元素的操作
 * 类型:行为型
 *
 * 适用场景:
 *      1.一个数据结构如(List/Set/Map等)包含很多类型对象
 *      2.数据结构与数据操作分类
 * 优点:
 *      1.增加新的操作很容易,就是增加一个新的访问者
 * 缺点:
 *      1.增加新的数据结构困难
 *      2.具体元素变更比较麻烦
 *
 * 比较低频的设计模式
 */
public class TestVisitor {

    /**
     * 网站上有免费课程和实战课程
     */
    public static void test() {
        List<Course> courseList = new ArrayList<>();

        //免费课程
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Android基础");

        //付费课程
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }

    }
}
