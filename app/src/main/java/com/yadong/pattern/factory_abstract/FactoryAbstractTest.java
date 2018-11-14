package com.yadong.pattern.factory_abstract;

import com.yadong.pattern.factory_abstract.base.BaseCourseFactory;
import com.yadong.pattern.factory_abstract.java_course.JavaCourseFactory;
import com.yadong.pattern.factory_abstract.python_course.PythonCourseFactory;

public class FactoryAbstractTest {

    /**
     * 抽象工厂
     * 定义:提供了一个创建一系列相关或相互依赖对象的接口
     * 特征:无须指定他们具体的类
     * 类型:创建型
     * 适用场景:
     *         1.客户端(应用层)不依赖于产品实例如何被创建,实现等细节
     *         2.强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
     *         3.提供一个产品类的库,所有的产品以同样的接口出现,从而使客户端不依赖于具体实现
     * 优点:
     *      1.具体产品在应用层代码隔离,无需关心创建细节
     *      2.将一个系列的产品族统一到一起创建
     * 缺点:
     *      1.规定了所有可能被创建的产品集合,产品族中扩展新的产品困难,需要修改抽象工厂的接口
     *      2.增加了系统的抽象性和理解难度
     */
    public static void test() {
        //通过JavaCourseFactory去创建javaVideo和JavaNote
        BaseCourseFactory courseFactory = new JavaCourseFactory();//创建Java课程工厂
        courseFactory.getVideo().produce();//通过工厂类得到JavaVideo对象并进行创建
        courseFactory.getNote().produce();//通过工厂类得到JavaNote对象并进行创建


        //通过PythonCourseFactory去创建pythonVideo和PythonNote
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();//创建Python课程工厂
        pythonCourseFactory.getVideo().produce();//通过工厂类得到PythonVideo对象并进行创建
        pythonCourseFactory.getNote().produce();//通过工厂类得到PythonNote对象并进行创建
    }
}
