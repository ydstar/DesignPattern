package com.yadong.pattern.creational.factory_simple;

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
public class TestFactorySimple {

    /**
     * 背景:想分享,然后通过生产Java视频和Python视频的方式进行传播
     * 目的:希望使用工厂方法模式实现这2个产品的生产
     * 步骤4. 创建工厂类对象,外界通过调用工厂类对象的方法，传入不同参数从而创建不同具体产品类的实例
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
