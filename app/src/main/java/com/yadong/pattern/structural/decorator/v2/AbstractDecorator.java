package com.yadong.pattern.structural.decorator.v2;

/**
 * 抽象的装饰类
 * 继承抽象的煎饼(ABatterCake),这个时候当前类(AbstractDecorator)和具体的煎饼类(BatterCake)都是继承于ABatterCake
 *
 * 如何让当前类和具体的煎饼类产生联系呢?
 * 可以通过两者共同的父类,可以把父类(ABatterCake)通过构造参数传递进来
 *
 */
public class AbstractDecorator  extends ABatterCake{


    private ABatterCake mBatterCake;//抽象的煎饼,当然也可以传具体的煎饼

    public AbstractDecorator(ABatterCake mBatterCake) {
        this.mBatterCake = mBatterCake;
    }


    @Override
    public String getDesc() {
        return this.mBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return this.mBatterCake.cost();
    }

}
