package com.yadong.pattern.structural.adapter.object_adapter;

/**
 * 适配器
 * 这种是组合的方式
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
