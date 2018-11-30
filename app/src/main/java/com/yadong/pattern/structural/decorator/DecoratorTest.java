package com.yadong.pattern.structural.decorator;

import com.yadong.pattern.structural.decorator.v1.BatterCakeWithEgg;
import com.yadong.pattern.structural.decorator.v1.BatterCakeWithEggSausage;
import com.yadong.pattern.structural.decorator.v2.ABatterCake;
import com.yadong.pattern.structural.decorator.v2.BatterCake;
import com.yadong.pattern.structural.decorator.v2.EggDecorator;
import com.yadong.pattern.structural.decorator.v2.SausageDecorator;

/**
 * 装饰器模式
 * 定义:在不改变原有对象的基础之上,将功能附加到对象上
 * 特征:提供了比继承更有弹性的提单方案(扩展原有对象功能)
 * 类型:结构型
 *
 * 适用场景:
 *      1.扩展一个类的功能或给一个类添加附加职责
 *      2.动态的给一个对象添加功能,这些功能可以再动态的撤销
 * 优点:
 *      1.继承的有力补充,比继承灵活,不改变原有对象的情况下给一个对象扩展功能
 *      2.通过使用不同装饰类以及这些装饰类的排列组合,可以实现不同效果
 *      3.符合开闭原则
 * 缺点:
 *      1.会出现更多的代码,更多的类,增加程序复杂性
 *      2.动态装饰时,多层装饰会更复杂
 */
public class DecoratorTest {

    /**
     * 这个只是铺垫
     * 场景:饿了,想买个煎饼吃,然后可以只买煎饼,还能加蛋,还能加烤肠
     */
    public static void testV1(){

        //煎饼
        com.yadong.pattern.structural.decorator.v1.BatterCake battercake =new com.yadong.pattern.structural.decorator.v1.BatterCake();
        System.out.println(battercake.getDesc()+" 销售价格:"+battercake.cost());

        //煎饼加个蛋
        BatterCakeWithEgg battercakeWithEgg = new BatterCakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格:"+battercakeWithEgg.cost());

        //煎饼加个蛋在加个烤肠
        BatterCakeWithEggSausage battercakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格:"+battercakeWithEggSausage.cost());

    }


    /**
     * 真正的装饰者模式
     * 这个时候一个小伙伴想吃个煎饼,加俩蛋,加3根烤肠,上面的v1版本就不好使了,这时候就要装饰模式登场了
     *
     * 抽象的实体类   抽象的煎饼
     * 确定的实体类   确定的煎饼,继承于抽象的煎饼
     *
     * 抽象的装饰者   继承于抽象的实体类(就是抽象的煎饼)
     * 确定的装饰者   蛋和烤肠,继承于抽象的装饰者
     *
     * 被装饰的实体是煎饼,然后装饰者是蛋和烤肠,4个角色缺一不可
     */
    public static void testV2(){
        ABatterCake batterCake;
        //煎饼
        batterCake = new com.yadong.pattern.structural.decorator.v2.BatterCake();
        //加蛋
        batterCake = new EggDecorator(batterCake);
        //在加蛋
        batterCake = new EggDecorator(batterCake);
        //加个烤肠
        batterCake = new SausageDecorator(batterCake);
        /**
         * 输出结果:
         * 8+1+1+2=12块钱
         * 煎饼加一个鸡蛋加一个鸡蛋加一个烤肠 销售价格:12
         */
        System.out.println(batterCake.getDesc()+" 销售价格:"+batterCake.cost());


        /**
         * 另外一种写法,连起来写
         * 输出结果:
         * 煎饼加一个鸡蛋加一个烤肠加一个烤肠 销售价格:13
         * 煎饼+蛋+烤肠+烤肠
         * 8+1+2+2=13块钱
         */
        SausageDecorator sausageBatterCake= new SausageDecorator(new SausageDecorator(new EggDecorator(new BatterCake())));
        System.out.println(sausageBatterCake.getDesc()+" 销售价格:"+sausageBatterCake.cost());


    }
}
