package com.yadong.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yadong.pattern.builder.Person;
import com.yadong.pattern.factory.SendFactory;
import com.yadong.pattern.factory.Sender;
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
 * 1.变化部分,不变化部分,提取变化部分,抽象成接口+实现
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * builder设计模式
     */
    public void method1() {
        Person person = Person.builder()
                .setName("晓明")
                .setAge(10)
                .build();
    }

    /**
     * 观察者模式
     */
    public void method2() {
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
    public void method3() {
        AddController addController = new AddController();
        ContactController contactController = new ContactController();

        //代理方把代理对象传给委托方
        addController.mDataInterface = contactController;
        addController.addEvent();
    }

    /**
     * 单例设计模式
     */
    public void method4() {
        Single instance = Single.getInstance();
        Single2 single2 = Single2.getInstance();
    }

    /**
     * 策略模式
     * 分别封装行为接口,实现算法族,父类中放行为接口对象,在子类里具体设定行为对象
     * 原则:分离变化部分,封装接口,基于接口编程各种功能.
     * 此模式让行为算法的变化独立于算法的使用者
     * <p>
     * 鸭子项目中,飞行或者叫声等行为是变化的(能飞和不能飞),这个需要抽象成接口,然后放在鸭子的父类中,让子类鸭子去实现
     */
    public void method5() {
        BaseDuck beiJingDuck = new BeiJingDuck();
        BaseDuck greenHeadDuck = new GreenHeadDuck();
        beiJingDuck.display();
        greenHeadDuck.fly();
        beiJingDuck.display();
        greenHeadDuck.fly();
    }

    /**
     * 工厂模式
     */
    public void method6() {
        Sender mail = SendFactory.product("mail");
        mail.send("hello,我是mail");

        Sender sms = SendFactory.product("sms");
        sms.send("hello,我是sms");
    }

    public void method7() {

    }

    public void method8() {

    }

    public void method9() {

    }

    public void method10() {

    }

    public void method11() {

    }

    public void method12() {

    }

    public void method13() {

    }

    public void method14() {

    }

    public void method15() {

    }

    public void method16() {

    }

    public void method17() {

    }

    public void method18() {

    }

    public void method19() {

    }

    public void method20() {

    }

    public void method21() {

    }

    public void method22() {

    }

    public void method23() {

    }


}
