package com.yadong.pattern.behavioral.observer;

/**
 * 观察者模式
 * 定义:定义了对象之间的一对多依赖,让多个观察者对象同时监听某一个主题对象,当主题对象发生变化时,它的所有观察者都会收到通知并更新
 * 类型:行为型
 *
 * 适用场景:
 *      1.关联行为场景,建立一套触发机制
 *
 * 优点:
 *      1.观察者和被观察者之间建立一个抽象的耦合
 *      2.观察者模式支持广播通信
 * 缺点:
 *      1.观察者之间有过多的细节依赖,提高时间消耗和程序复杂度
 *      2.使用要得当,要避免循环调用
 */
public class ObserverTest {

    /**
     *
     */
    public static void test() {
        //创建2个观察者
        Observer fanbingbing = new GirlFriendObserver("范冰冰");
        Observer yangmi = new GirlFriendObserver("杨幂");

        //创建被观察者
        MessageObservable messageSubject = new MessageObservable();

        //被观察者 添加 观察者 到集合中
        messageSubject.attach(fanbingbing);
        messageSubject.attach(yangmi);
        //被观察者 通知 观察者,我都干了什么
        messageSubject.change("我在大保健");

        messageSubject.dettch(yangmi);
        messageSubject.notyfyObservers("泡吧");
    }
}
