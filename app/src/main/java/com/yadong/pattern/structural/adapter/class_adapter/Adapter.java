package com.yadong.pattern.structural.adapter.class_adapter;

/**
 * 适配器来适配 被适配者,来达到target的目标
 * 这种是继承的模式
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }

}
