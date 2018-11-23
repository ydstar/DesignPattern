package com.yadong.pattern.behavioral.observer;

/**
 * 
 * 被观察者的 子类
 */
public class MessageObservable extends Observable {

	public void change(String state) {

		notyfyObservers(state);
	}

}
