package com.yadong.pattern.strategy.duck;

import com.yadong.pattern.strategy.behaviour.FlyNoWayImp;

/**
 * 北京烤鸭,飞不起来
 * 构造方法中,实现了飞不起来的行为接口实现类对象
 */
public class BeiJingDuck extends BaseDuck {

    public BeiJingDuck() {
        mFlyBehaviour = new FlyNoWayImp();
    }

    @Override
    public void display() {
        System.out.println(BeiJingDuck.class.getName());
    }
}
