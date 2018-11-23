package com.yadong.pattern.behavioral.observer;


/**
 * 
 * 观察者的一个子类 实现类
 * 
 * 我的其中一个女朋友
 */
public class GirlFriendObserver implements Observer {

	private String name;

	public String getName() {
		return name;
	}

	public GirlFriendObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String state) {

		System.out.println(name + "接到最新消息,男朋友最新状态:" + state);
	}

}
