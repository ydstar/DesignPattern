package com.yadong.pattern.creational.factory_abstract.python_course;

import com.yadong.pattern.creational.factory_abstract.base.BaseNote;

/**
 * 步骤3： 创建具体产品类（继承抽象产品类）， 定义生产的具体产品；
 * Python笔记对象
 */
public class PythonNote extends BaseNote {
    @Override
    public void produce() {
        System.out.println("编写Python课程笔记");
    }
}
