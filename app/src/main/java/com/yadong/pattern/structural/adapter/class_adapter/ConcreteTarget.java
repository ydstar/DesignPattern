package com.yadong.pattern.structural.adapter.class_adapter;

/**
 * 具体的目标 实现接口
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
