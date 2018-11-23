package com.yadong.pattern.structural.decorator.v2;

/**
 * 具体的实体类
 * 具体的煎饼
 */
public class BatterCake extends  ABatterCake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
