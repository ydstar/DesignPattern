package com.yadong.pattern.strategy.behaviour;

/**
 * 能够飞行的行为接口实现类
 */
public class FlyImp implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("能够飞行~~~");
    }
}
