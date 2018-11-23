package com.yadong.pattern.structural.decorator.v2;

/**
 * 鸡蛋装饰类
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake mBatterCake) {
        super(mBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
