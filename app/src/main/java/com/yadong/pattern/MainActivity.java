package com.yadong.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yadong.pattern.creational.builder.BuilderTest;
import com.yadong.pattern.structural.decorator.DecoratorTest;
import com.yadong.pattern.structural.facade.FacadeTest;
import com.yadong.pattern.creational.factory_abstract.FactoryAbstractTest;
import com.yadong.pattern.creational.factory_method.FactoryMethodTest;
import com.yadong.pattern.creational.factory_simple.FactorySimpleTest;
import com.yadong.pattern.behavioral.observer.ObserverTest;
import com.yadong.pattern.creational.prototype.PrototypeTest;
import com.yadong.pattern.structural.proxy.ProxyTest;
import com.yadong.pattern.creational.single.SingletonTest;
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
        method8();
    }

    /*******************创建型模式***********************************************/
    /**
     * 简单工厂,它不属于GOF23种设计模式
     */
    public void method1() {
        FactorySimpleTest.test();
    }

    /**
     * 工厂方法
     */
    public void method2() {
        FactoryMethodTest.test();
    }

    /**
     * 抽象工厂
     */
    public void method3() {
        FactoryAbstractTest.test();
    }

    /**
     * 建造者模式
     */
    public void method4() {
        BuilderTest.test();
    }

    /**
     * 单例设计模式
     */
    public void method5() throws Exception {
        SingletonTest.test();
    }

    /**
     * 原型模式
     */
    public void method6() throws Exception {
        PrototypeTest.test();
    }


    /*******************结构型模式*******************************************************************/
    /**
     * 外观模式
     */
    public void method7() {
        FacadeTest.test();
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

    }

    /**
     * 享元模式
     */
    public void method10() {

    }

    /**
     * 组合模式
     */
    public void method11() {

    }

    /**
     * 桥接模式
     */
    public void method12() {

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
