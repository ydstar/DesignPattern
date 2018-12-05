package com.yadong.pattern.behavioral.mediator;


/**
 * 中介者模式
 * 定义:定义一个封装一组对象如何交互的对象
 * 特征:通过使对象明确的相互引用来促进松散耦合,并允许独立的改变他们的交互
 * 类型:行为型
 *
 * 适用场景:
 *      1.系统中对象之间存在复杂的引用关系,产生的相互依赖关系结构混乱且难以理解
 *      2.交互的公共行为,如果需要改变行为则可以增加新的中介者类
 * 优点:
 *      1.将一对多转化成了一对一,降低程序复杂度
 *      2.类之间解耦
 * 缺点:
 *      1.中介者过多,导致系统复杂
 */
public class TestMediator {

    /**
     * 风清扬和令狐冲交流,传授独孤九剑
     */
    public static void test() {

        User fengqingyang = new User("风清扬");
        User linghuchong = new User("令狐冲");

        fengqingyang.sendMessage("传授你独孤九剑");
        linghuchong.sendMessage("OK");
    }


}
