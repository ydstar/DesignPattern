package com.yadong.pattern.creational.factory_abstract.python_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseNote;
import com.yadong.pattern.creational.factory_abstract.base.BaseVideo;
import com.yadong.pattern.creational.factory_abstract.base.BaseCourseFactory;

/**
 * 步骤4：创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法；
 * 具体的Python课程工厂,专门生产PythonVideo和PythonNotes
 */
public class PythonCourseFactory implements BaseCourseFactory {

    @Override
    public BaseVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public BaseNote getNote() {
        return new PythonNote();
    }
}
