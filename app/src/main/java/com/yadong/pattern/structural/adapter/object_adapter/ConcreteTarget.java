package com.yadong.pattern.structural.adapter.object_adapter;

/**
 *
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
