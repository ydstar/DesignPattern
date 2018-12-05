package com.yadong.pattern.behavioral.chain_of_responsibility;


/**
 * 责任链模式
 * 定义:为请求创建一个接受此次请求对象的链
 * 类型:行为型
 *
 * 适用场景:
 *      1.一个请求的处理需要多个对象当中的一个或几个协作处理
 * 优点:
 *      1.请求的发送者和接受者(请求的处理者)解耦
 *      2.责任链可以动态组合
 * 缺点:
 *      1.责任链太长或者处理时间过长,影响性能
 *      2.责任链有可能过多
 *
 */
public class TestChainOfResponsibility {

    /**
     * 在网站上发布一个课程,需要两个人检查,一个是视频,一个是手记
     */
    public static void test() {
        //创建手记批准者
        Approver articleApprover = new ArticleApprover();
        //创建视频批准者
        Approver videoApprover = new VideoApprover();

        //创建课程
        Course course = new Course();
        course.setName("Java设计模式精讲");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        //校验
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
