package com.yadong.pattern.creational.factory_method;

import com.yadong.pattern.creational.factory_method.base.BaseVideo;
import com.yadong.pattern.creational.factory_method.java_video.JavaVideoFactory;
import com.yadong.pattern.creational.factory_method.python_video.PythonVideoFactory;

public class FactoryMethodTest {

    /**
     * 工厂方法
     * 定义:定义一个创建对象的接口,但是让实现这个接口的类来决定实例化哪个类,工厂方法让类的实例化推迟到子类中进行
     * 类型:创建型
     * 适用场景:
     *         1.创建对象需要大量重复的代码
     *         2.客户端(应用层)不依赖于产品类实例如何被创建,实现等细节
     *         3.一个类通过其子类来指定创建哪个对象
     *         4.创建对象的过程推迟到子类中来
     * 优点:
     *      1.用户只需要关心所需产品对应的工厂,无需关心创建细节
     *      2.加入新产品符合开闭原则,提高可扩展性
     * 缺点:
     *      1.类的个数容易过多,增加复杂度
     *      2.增加了系统的抽象性和理解难度
     *
     * 个人理解:
     *          我们只需要关心产品对应的工厂,而不需要关心其细节.然后想创建什么类就找对应的工厂.
     *          然后类的具体实例化延迟到子类工厂类中去进行
     */
    public static void test() {
        //创建JavaVideo,对应的工厂创建对应的对象
        JavaVideoFactory factory = new JavaVideoFactory();
        BaseVideo video = factory.getVideo();
        video.produce();

        //创建PythonVideo,对应的工厂创建对应的对象
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        BaseVideo pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.produce();
    }
}
