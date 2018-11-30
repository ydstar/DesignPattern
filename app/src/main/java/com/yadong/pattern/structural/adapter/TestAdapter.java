package com.yadong.pattern.structural.adapter;


import com.yadong.pattern.structural.adapter.class_adapter.Adapter;
import com.yadong.pattern.structural.adapter.class_adapter.ConcreteTarget;
import com.yadong.pattern.structural.adapter.class_adapter.Target;
import com.yadong.pattern.structural.adapter.voltage_adapter.DC5;
import com.yadong.pattern.structural.adapter.voltage_adapter.PowerAdapter;

/**
 * 适配器模式
 * 定义:将一个类的接口转换成客户期望的另一个接口
 * 特征:使原本接口不兼容的类可以一起工作
 * 类型:结构型
 * 适用场景:
 *         1.已经存在的类,它的方法和需求不匹配时(方法结果相同或相似)
 *         2.不是软件设计阶段考虑的设计模式,是随着软件维护,由于不同产品,不同厂家造成功能类似而接口不相同情况下的解决方案
 * 优点:
 *      1.能提高类的透明性和复用,现有的类复用但不需要改变
 *      2.目标类和适配器类解耦,提高程序扩展性
 *      3.符合开闭原则
 * 缺点:
 *      1.适配器编写过程要全面考虑,可能会增加系统的复杂性
 *      2.增加系统代码可读的难度
 * 扩展:
 *      1.类适配器---通过类继承来实现的
 *      2.对象适配器---符合组合复用原则,使用委托机制
 */
public class TestAdapter {


    /**
     * 类适配器的模型
     * 继承的方式
     * 四个角色:
     *      1.被适配者
     *      2.适配者
     *      3.目标接口
     *      4.目标接口的实现类
     * 目的就是让适配者通过他的一顿操作,达到融合被适配者和目标接口到一个类中.
     */
    public static void classAdapterTest(){
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }


    /**
     * 对象适配器
     * 组合的方式
     * 四个角色:
     *      1.被适配者
     *      2.适配者
     *      3.目标接口
     *      4.目标接口的实现类
     * 目的就是让适配者通过他的一顿操作,达到融合被适配者和目标接口到一个类中.
     */
    public static void objectAdapterTest(){

        com.yadong.pattern.structural.adapter.object_adapter.Target target = new com.yadong.pattern.structural.adapter.object_adapter.ConcreteTarget();
        target.request();


        com.yadong.pattern.structural.adapter.object_adapter.Target adapter = new com.yadong.pattern.structural.adapter.object_adapter.Adapter();
        adapter.request();

    }

    /**
     * 对象适配器
     * 场景:把220V的电压通过手机充电器转换成5V的电压给手机进行充电
     * 组合的方式
     * 四个角色:
     *      1.被适配者(AC220)
     *      2.适配者(PowerAdapter)
     *      3.目标接口(DC5)
     *      4.目标接口的实现类(老项目的目标接口的实现类,这里面没有,如果有,可以把代码移到适配者中)
     * 目的就是让适配者(PowerAdapter)通过他的一顿操作,达到融合被适配者(AC220)和目标接口(DC5)到一个类中.
     */
    public static void powerAdapter(){
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
