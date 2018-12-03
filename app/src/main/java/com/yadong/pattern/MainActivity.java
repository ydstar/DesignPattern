package com.yadong.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yadong.pattern.behavioral.template_method.TestTemplateMethod;
import com.yadong.pattern.creational.builder.TestBuilder;
import com.yadong.pattern.structural.adapter.TestAdapter;
import com.yadong.pattern.structural.bridge.BridgeTest;
import com.yadong.pattern.structural.composite.TestComposite;
import com.yadong.pattern.structural.decorator.DecoratorTest;
import com.yadong.pattern.structural.facade.TestFacade;
import com.yadong.pattern.creational.factory_abstract.TestFactoryAbstract;
import com.yadong.pattern.creational.factory_method.TestFactoryMethod;
import com.yadong.pattern.creational.factory_simple.TestFactorySimple;
import com.yadong.pattern.behavioral.observer.ObserverTest;
import com.yadong.pattern.creational.prototype.TestPrototype;
import com.yadong.pattern.structural.flyweight.TestFlyweight;
import com.yadong.pattern.structural.proxy.ProxyTest;
import com.yadong.pattern.creational.single.TestSingleton;
import com.yadong.pattern.behavioral.strategy.StrategyTest;

/**
 * 设计模式大全
 * <p>
 * 创建型模式
 * |1---简单工厂模式(它不属于23种设计模式)
 * |2---工厂方法模式
 * |3---抽象工厂模式
 * |4---建造者模式
 * |5---单例模式
 * |6---原型模式
 * <p>
 * 结构型模式
 * |7---外观模式
 * |8---装饰器模式
 * |9---适配器模式
 * |10---享元模式
 * |11---组合模式
 * |12---桥接模式
 * |13---代理模式
 * <p>
 * 行为型模式
 * |14---模板方法模式
 * |15---迭代器模式
 * |16---策略模式
 * |17---解释器模式
 * |18---观察者模式
 * |19---备忘录模式
 * |20---命令模式
 * |21---中介者模式
 * |22---责任链模式
 * |23---访问者模式
 * |24---状态模式
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
    public void testClick(View view) throws Exception {
        //        method1();
        //        method2();
        //        method3();
        //        method4();
        //        method5();
        //        method6();
        //        method7();
//        method8();\
//        method9();
//        method10();
//        method11();
//        method12();
//        method13();
        method14();
    }

    /*******************创建型模式***********************************************/
    /**
     * 简单工厂,它不属于GOF23种设计模式
     */
    public void method1() {
        TestFactorySimple.test();
    }

    /**
     * 工厂方法
     */
    public void method2() {
        TestFactoryMethod.test();
    }

    /**
     * 抽象工厂
     */
    public void method3() {
        TestFactoryAbstract.test();
    }

    /**
     * 建造者模式
     */
    public void method4() {
        TestBuilder.test();
    }

    /**
     * 单例设计模式
     */
    public void method5() throws Exception {
        TestSingleton.test();
    }

    /**
     * 原型模式
     */
    public void method6() throws Exception {
        TestPrototype.test();
    }


    /*******************结构型模式*******************************************************************/
    /**
     * 外观模式
     */
    public void method7() {
        TestFacade.test();
    }

    /**
     * 装饰器模式
     */
    public void method8() {
        DecoratorTest.testV2();
    }

    /**
     * 适配器模式
     */
    public void method9() {
        TestAdapter.classAdapterTest();
        TestAdapter.objectAdapterTest();
        TestAdapter.powerAdapter();
    }

    /**
     * 享元模式
     */
    public void method10() {
        TestFlyweight.test();
    }

    /**
     * 组合模式
     */
    public void method11() {
        TestComposite.test();
    }

    /**
     * 桥接模式
     */
    public void method12() {
        BridgeTest.test();
    }

    /**
     * 代理模式
     */
    public void method13() {
        ProxyTest.test();
    }

    /*******************行为型模式*******************************************************************/
    /**
     * 模板方法模式
     */
    public void method14() {
        TestTemplateMethod.test();
    }

    /**
     * 迭代器模式
     */
    public void method15() {

    }

    /**
     * 策略模式
     */
    public void method16() {
        StrategyTest.test();
    }

    /**
     * 解释器模式
     */
    public void method17() {

    }

    /**
     * 观察者模式
     */
    public void method18() {
        ObserverTest.test();
    }

    /**
     * 备忘录模式
     */
    public void method19() {

    }

    /**
     * 命令模式
     */
    public void method20() {

    }

    /**
     * 中介者模式
     */
    public void method21() {

    }

    /**
     * 责任链模式
     */
    public void method22() {

    }

    /**
     * 访问者模式
     */
    public void method23() {

    }

    /**
     * 状态模式
     */
    public void method24() {

    }


}
