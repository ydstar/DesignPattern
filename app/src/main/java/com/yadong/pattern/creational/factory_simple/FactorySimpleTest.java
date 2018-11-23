package com.yadong.pattern.creational.factory_simple;

public class FactorySimpleTest {


    /**
     * 简单工厂,它不属于GOF23种设计模式
     * 定义:由一个工厂对象决定创建出哪一种产品类的实例
     * 类型:创建型
     * 适用场景:
     * 1.工厂类负责创建的对象比较少
     * 2.客户端(应用层)只知道传入工厂类的参数,对于如何创建对象并不关心
     * 优点:
     * 1.只需要传入一个正确的参数,就可以获取你所需要的对象而无需知道其创建细节
     * 缺点:
     * 1.工厂类的职责相对过重,增加新的产品,需要修改工厂类的判断逻辑,违背开闭原则
     */
    public static void test() {
        VideoFactory videoFactory = new VideoFactory();
        //创建JavaVideo,根据类的Class字节码
        com.yadong.pattern.creational.factory_simple.BaseVideo javaVideo = videoFactory.getVideo(JavaVideo.class);
        javaVideo.produce();

        //创建PythonVideo,根据String字符串类型
        com.yadong.pattern.creational.factory_simple.BaseVideo pythonVideo = videoFactory.getVideo("python");
        pythonVideo.produce();
    }
}
