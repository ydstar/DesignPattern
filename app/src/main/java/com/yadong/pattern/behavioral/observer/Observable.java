package com.yadong.pattern.behavioral.observer;

import java.util.ArrayList;

/**
 * 
 * 被观察者 
 * 我自己
 */
public abstract class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	/**
	 * 添加一个观察者
	 */
	public void attach(Observer observer) {
		observers.add(observer);
		System.out.println("我新交了一个女朋友");
	}

	/**
	 *去掉一个观察者 
	 */
	public void dettch(Observer observer) {
		observers.remove(observer);
		System.out.println("我和她分手了");
	}

	/**
	 * 通知观察者(就是通知我的女朋友们)
	 */
	public void notyfyObservers(String state) {
		for (Observer observer : observers) {

			observer.update(state);

		}

	}

}
