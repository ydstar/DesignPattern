package com.yadong.pattern.structural.decorator.v1;

/**
 * 煎饼中加个蛋
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    /**
     * 成本加1块钱
     */
    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
