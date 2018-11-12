package com.yadong.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yadong.pattern.builder.Person;
import com.yadong.pattern.factory_abstract.Article;
import com.yadong.pattern.factory_abstract.CourseFactory;
import com.yadong.pattern.factory_abstract.JavaCourseFactory;
import com.yadong.pattern.factory_method.JavaVideoFactory;
import com.yadong.pattern.factory_method.Video;
import com.yadong.pattern.factory_simple.BaseVideo;
import com.yadong.pattern.factory_simple.JavaVideo;
import com.yadong.pattern.factory_simple.VideoFactory;
import com.yadong.pattern.observer.GirlFriendObserver;
import com.yadong.pattern.observer.MessageObservable;
import com.yadong.pattern.observer.Observer;
import com.yadong.pattern.proxy.AddController;
import com.yadong.pattern.proxy.ContactController;
import com.yadong.pattern.single.Single;
import com.yadong.pattern.single.Single2;
import com.yadong.pattern.strategy.duck.BaseDuck;
import com.yadong.pattern.strategy.duck.BeiJingDuck;
import com.yadong.pattern.strategy.duck.GreenHeadDuck;

/**
 * 设计模式大全
 *
 *创建型模式
 *      |0---简单工厂模式(它不属于23种设计模式)
 *      |1---工厂方法模式
 *      |2---抽象工厂模式
 *      |3---建造者模式
 *      |4---单例模式
 *      |5---原型模式
 *
 *结构型模式
 *      |6---外观模式
 *      |7---装饰器模式
 *      |8---适配器模式
 *      |9---享元模式
 *      |10---组合模式
 *      |11---桥接模式
 *      |12---代理模式
 *
 *行为型模式
 *      |13---模板方法模式
 *      |14---迭代器模式
 *      |15---策略模式
 *      |16---解释器模式
 *      |17---观察者模式
 *      |18---备忘录模式
 *      |19---命令模式
 *      |20---中介者模式
 *      |21---责任链模式
 *      |22---访问者模式
 *      |23---状态模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*******************创建型模式***********************************************/
    /**
     * 简单工厂,它不属于23种设计模式
     */
    public void method0() {
        VideoFactory videoFactory = new VideoFactory();
        BaseVideo video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }

    /**
     * 工厂方法
     * 定义一个创建对象的接口,但是让实现这个接口的类来决定实例化哪个类,工厂方法让类的实例化推迟到子类中进行
     */
    public void method1() {
        JavaVideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }

    /**
     * 抽象工厂:提供了一个创建一系列相关或相互依赖对象的接口
     * 特征:无须指定他们具体的类
     * 类型:创建型
     */
    public void method2() {
        CourseFactory courseFactory = new JavaCourseFactory();
        com.yadong.pattern.factory_abstract.Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }

    /**
     * builder设计模式
     */
    public void method3() {
        Person person = Person.builder()
                .setName("风清扬")
                .setAge(99)
                .setKungFu("独孤九剑")
                .build();
        System.out.println(person.toString());
    }


    /**
     * 单例设计模式
     */
    public void method4() {
        Single instance = Single.getInstance();
        Single2 single2 = Single2.getInstance();
    }

    /**
     * 原型模式
     */
    public void method5() {

    }

    /*******************结构型模式*******************************************************************/

    /**
     * 外观模式
     */
    public void method6() {

    }

    /**
     * 装饰器模式
     */
    public void method7() {

    }

    /**
     * 适配器模式
     */
    public void method8() {

    }

    /**
     * 享元模式
     */
    public void method9() {

    }

    /**
     * 组合模式
     */
    public void method10() {

    }

    /**
     * 桥接模式
     */
    public void method11() {

    }

    /**
     * 代理模式
     * 通过接口的方式 传递数据
     * 现在有一个 添加页面,联系人页面,当在添加页面中添加数据的时候,要把数据传递到联系人页面显示
     * <p>
     * 1.先定义接口,该接口中,有一个方法,这个方法有两个参数,1.要传出去数据的那个页面对象 2.数据
     * 2.联系人页面ContactController 实现这个接口,和实现方法(此时ContactController是接口的实现类)
     * 2.AddController中持有接口的字段,把上面这个接口的实现类赋值给AddController中的接口字段
     * 3.当添加页面中的添加事件被触发的时候,让这个接口的实现类调用接口中的方法,从而实现了数据的传递
     * <p>
     * 委托方和代理方
     * 委托方定义接口和使用接口中的方法
     * 代理方把代理对象传给委托方并实现委托方的接口,从而实现代理模式
     */
    public void method12() {
        AddController addController = new AddController();
        ContactController contactController = new ContactController();

        //代理方把代理对象传给委托方
        addController.mDataInterface = contactController;
        addController.addEvent();
    }

    /*******************行为型模式*******************************************************************/


    /**
     * 模板方法模式
     */
    public void method13() {

    }

    /**
     * 迭代器模式
     */
    public void method14() {

    }

    /**
     * 策略模式
     * 分别封装行为接口,实现算法族,父类中放行为接口对象,在子类里具体设定行为对象
     * 原则:分离变化部分,封装接口,基于接口编程各种功能.
     * 此模式让行为算法的变化独立于算法的使用者
     * <p>
     * 鸭子项目中,飞行或者叫声等行为是变化的(能飞和不能飞),这个需要抽象成接口,然后放在鸭子的父类中,让子类鸭子去实现
     */
    public void method15() {
        BaseDuck beiJingDuck = new BeiJingDuck();
        BaseDuck greenHeadDuck = new GreenHeadDuck();
        beiJingDuck.display();
        greenHeadDuck.fly();
        beiJingDuck.display();
        greenHeadDuck.fly();
    }

    /**
     * 解释器模式
     */
    public void method16() {

    }

    /**
     * 观察者模式
     */
    public void method17() {
        //创建2个观察者
        Observer fanbingbing = new GirlFriendObserver("范冰冰");
        Observer yangmi = new GirlFriendObserver("杨幂");

        //创建被观察者
        MessageObservable messageSubject = new MessageObservable();

        //被观察者 添加 观察者 到集合中
        messageSubject.attach(fanbingbing);
        messageSubject.attach(yangmi);
        //被观察者 通知 观察者,我都干了什么
        messageSubject.change("我在大保健");

        messageSubject.dettch(yangmi);
        messageSubject.notyfyObservers("泡吧");
    }

    /**
     * 备忘录模式
     */
    public void method18() {

    }

    /**
     * 命令模式
     */
    public void method19() {

    }

    /**
     * 中介者模式
     */
    public void method20() {

    }

    /**
     * 责任链模式
     */
    public void method21() {

    }

    /**
     * 访问者模式
     */
    public void method22() {

    }

    /**
     * 状态模式
     */
    public void method23() {

    }


}
