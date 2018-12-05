package com.yadong.pattern.behavioral.strategy;

import com.yadong.pattern.behavioral.strategy.duck.BaseDuck;
import com.yadong.pattern.behavioral.strategy.duck.BeiJingDuck;
import com.yadong.pattern.behavioral.strategy.duck.GreenHeadDuck;

/**
 * 策略模式
 * 定义:定义了算法家族,分别封装起来,让它们之间可以互相替换,此模式让算法的变化不会影响到使用算法的用户
 * 类型:行为型
 *
 * 适用场景:
 *      1.系统有很多类,而它们的区别仅仅在于它们的行为不同
 *      2.一个系统需要动态的在几种算法中选择一种
 * 优点:
 *      1.开闭原则
 *      2.避免使用多重条件转移语句
 *      3.提高算法的保密性和安全性
 * 缺点:
 *      1.客户端必须知道所有的策略类,并自行决定使用哪一个策略类
 *      2.产生很多策略类
 *
 */
public class StrategyTest {

    /**
     *
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
