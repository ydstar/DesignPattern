package com.yadong.pattern.structural.decorator.v2;

/**
 * 烤肠装饰类
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake mBatterCake) {
        super(mBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个烤肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
