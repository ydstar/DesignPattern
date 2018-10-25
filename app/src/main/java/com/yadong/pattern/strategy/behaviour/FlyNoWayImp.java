package com.yadong.pattern.strategy.behaviour;

/**
 * 不能够飞行的行为接口实现类
 */
public class FlyNoWayImp implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("不能飞,飞不起来~~~");
    }
}
