package com.yadong.pattern.strategy.duck;

import com.yadong.pattern.strategy.behaviour.FlyBehaviour;
import com.yadong.pattern.strategy.behaviour.FlyImp;
import com.yadong.pattern.strategy.behaviour.FlyNoWayImp;

/**
 * 父类 Duck
 */
public abstract class BaseDuck {

    //这个是接口,让子类去实现这个接口
    FlyBehaviour mFlyBehaviour;

    public void fly() {
        mFlyBehaviour.fly();
    }


    public abstract void display();


    /**
     * 设置可以飞行的行为接口实现类
     */
    public void  setFlyBehaviour(FlyImp flyImp){
        this.mFlyBehaviour=flyImp;
    }

    /**
     * 设置不可以飞行的行为接口实现类
     */
    public  void  setFlyNoWayBehaviour(FlyNoWayImp flyNoWayBehaviour){
        this.mFlyBehaviour=flyNoWayBehaviour;

    }
}
