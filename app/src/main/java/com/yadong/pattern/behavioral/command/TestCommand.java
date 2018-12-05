package com.yadong.pattern.behavioral.command;


/**
 * 命令模式
 * 定义:将请求封装成对象,以便使用不同的请求
 * 特征:命令模式解决了应用程序中对象的职责和它们之间的通信方式
 * 类型:行为型
 *
 * 适用场景:
 *      1.请求的调用者和请求接受者需要解耦,使得调用者和接受者不直接交互
 *      2.需要抽象出等待执行的行为
 * 优点:
 *      1.降低耦合
 *      2.容易扩展新命令或者一组命令
 * 缺点:
 *      1.命令的无限扩展会增加类的数量,提高系统的实现复杂度
 *
 */
public class TestCommand {

    /**
     * 场景:网站上课程是有视频的,免费打开视频让大家看或者关闭这个视频收费才能看
     */
    public static void test() {
        //创建课程
        CourseVideo courseVideo = new CourseVideo("Java设计模式");
        //创建打开命令
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        //创建关闭命令
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        //创建工作人员
        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        //执行这一组命令
        staff.executeCommands();
    }

}
