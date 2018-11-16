package com.yadong.pattern;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yadong.pattern.builder.BuilderTest;
import com.yadong.pattern.builder.Person;
import com.yadong.pattern.facade.FacadeTest;
import com.yadong.pattern.factory_abstract.FactoryAbstractTest;
import com.yadong.pattern.factory_abstract.base.BaseCourseFactory;
import com.yadong.pattern.factory_abstract.python_course.PythonCourseFactory;
import com.yadong.pattern.factory_abstract.java_course.JavaCourseFactory;
import com.yadong.pattern.factory_method.FactoryMethodTest;
import com.yadong.pattern.factory_method.java_video.JavaVideoFactory;
import com.yadong.pattern.factory_method.python_video.PythonVideoFactory;
import com.yadong.pattern.factory_method.base.BaseVideo;
import com.yadong.pattern.factory_simple.FactorySimpleTest;
import com.yadong.pattern.factory_simple.JavaVideo;
import com.yadong.pattern.factory_simple.VideoFactory;
import com.yadong.pattern.observer.GirlFriendObserver;
import com.yadong.pattern.observer.MessageObservable;
import com.yadong.pattern.observer.Observer;
import com.yadong.pattern.observer.ObserverTest;
import com.yadong.pattern.prototype.PrototypeTest;
import com.yadong.pattern.prototype.deep_clone.Pig;
import com.yadong.pattern.prototype.shallow_clone.Mail;
import com.yadong.pattern.prototype.shallow_clone.MailUtil;
import com.yadong.pattern.proxy.AddController;
import com.yadong.pattern.proxy.ContactController;
import com.yadong.pattern.proxy.ProxyTest;
import com.yadong.pattern.single.EnumInstance;
import com.yadong.pattern.single.HungrySingleton;
import com.yadong.pattern.single.LazyDoubleCheckSingleton;
import com.yadong.pattern.single.SingletonTest;
import com.yadong.pattern.single.StaticInnerClassSingleton;
import com.yadong.pattern.strategy.StrategyTest;
import com.yadong.pattern.strategy.duck.BaseDuck;
import com.yadong.pattern.strategy.duck.BeiJingDuck;
import com.yadong.pattern.strategy.duck.GreenHeadDuck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

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

    /**
     * 测试按钮
     */
    public void testClick(View view)throws Exception {
//        method0();
//        method1();
//        method2();
//        method3();
//        method4();
//        method5();
        method6();
    }

    /*******************创建型模式***********************************************/
    /**
     * 简单工厂,它不属于GOF23种设计模式
     */
    public void method0() {
        FactorySimpleTest.test();
    }

    /**
     * 工厂方法
     */
    public void method1() {
        FactoryMethodTest.test();
    }

    /**
     * 抽象工厂
     */
    public void method2() {
        FactoryAbstractTest.test();
    }

    /**
     * 建造者模式
     */
    public void method3() {
        BuilderTest.test();
    }

    /**
     * 单例设计模式
     */
    public void method4()throws Exception {
        SingletonTest.test();
    }

    /**
     * 原型模式
     */
    public void method5() throws Exception {
        PrototypeTest.test();
    }


    /*******************结构型模式*******************************************************************/
    /**
     * 外观模式
     */
    public void method6() {
        FacadeTest.test();
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
     */
    public void method12() {
        ProxyTest.test();
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
     */
    public void method15() {
        StrategyTest.test();
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
        ObserverTest.test();
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
