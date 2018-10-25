package com.yadong.pattern.strategy.duck;

import com.yadong.pattern.strategy.behaviour.FlyImp;

/**
 * 绿头鸭,能够飞行
 * 在构造方法中实现了飞行行为的接口
 */
public class GreenHeadDuck extends BaseDuck {


    public GreenHeadDuck() {
        this.mFlyBehaviour = new FlyImp();
    }

    @Override
    public void display() {
        System.out.println(GreenHeadDuck.class.getName());
    }
}
