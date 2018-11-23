package com.yadong.pattern.structural.decorator.v1;

/**
 * 煎饼中加个蛋的基础上在加个烤肠
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根烤肠";
    }

    /**
     * 成本有加了2块钱
     */
    @Override
    public int cost() {
        return super.cost()+2;
    }
}
