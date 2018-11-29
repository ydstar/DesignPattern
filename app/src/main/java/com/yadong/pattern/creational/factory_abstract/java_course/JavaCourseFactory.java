package com.yadong.pattern.creational.factory_abstract.java_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseNote;
import com.yadong.pattern.creational.factory_abstract.base.BaseVideo;
import com.yadong.pattern.creational.factory_abstract.base.BaseCourseFactory;

/**
 * 步骤4：创建具体工厂类(实现抽象工厂接口),定义创建对应具体产品实例的方法
 * 具体的Java课程工厂,专门生产JavaVideo和JavaNotes
 */
public class JavaCourseFactory implements BaseCourseFactory {

    @Override
    public BaseVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public BaseNote getNote() {
        return new JavaNote();
    }
}
