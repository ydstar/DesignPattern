package com.yadong.pattern.behavioral.template_method;


/**
 * 模板方法
 * 定义:定义了一个算法的骨架,并允许子类为一个或多个步骤提供实现
 * 特征:模板方法使得子类可以在不改变算法结构的情况下,重新定义算法的某些步骤
 * 类型:行为型
 *
 * 适用场景:
 *      1.一次性实现一个算法的不变的部分,并将可变的行为留给子类来实现
 *      2.各子类中公共的行为被提取出来并集中到一个公共父类中,从而避免代码重复
 * 优点:
 *      1.提高复用性
 *      2.提高扩展性
 *      3.符合开闭原则
 * 缺点:
 *      1.类数目的增加
 *      2.增加了系统实现的复杂度
 *      3.继承关系自身缺点,如果父类添加新的抽象方法,所有的子类都要改一遍
 * 扩展:
 *      1.钩子方法
 */
public class TemplateMethodTest {


    /**
     * 场景:录制视频都需要编写ppt,制作视频和写手记,然后用这个模板制作不同的课程
     */
    public static void  test(){
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }

}
