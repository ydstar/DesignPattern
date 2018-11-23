package com.yadong.pattern.behavioral.strategy;

import com.yadong.pattern.behavioral.strategy.duck.BaseDuck;
import com.yadong.pattern.behavioral.strategy.duck.BeiJingDuck;
import com.yadong.pattern.behavioral.strategy.duck.GreenHeadDuck;

public class StrategyTest {

    /**
     * 策略模式
     * 分别封装行为接口,实现算法族,父类中放行为接口对象,在子类里具体设定行为对象
     * 原则:分离变化部分,封装接口,基于接口编程各种功能.
     * 此模式让行为算法的变化独立于算法的使用者
     * <p>
     * 鸭子项目中,飞行或者叫声等行为是变化的(能飞和不能飞),这个需要抽象成接口,然后放在鸭子的父类中,让子类鸭子去实现
     */
    public static  void test() {
        BaseDuck beiJingDuck = new BeiJingDuck();
        BaseDuck greenHeadDuck = new GreenHeadDuck();
        beiJingDuck.display();
        greenHeadDuck.fly();
        beiJingDuck.display();
        greenHeadDuck.fly();
    }
}
