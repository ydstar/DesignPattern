package com.yadong.pattern.structural.facade;

/**
 *
 * 外观模式
 * 定义:又叫门面模式,提供了一个统一的接口,用来访问一个或多个子系统中的一群接口
 * 特征:外观模式定义了一个高层接口,让子系统更容易使用
 * 类型:结构性
 * 适用场景:
 *         1.子系统越来越复杂,增加外观模式提供简单调用接口
 *         2.构建多层结构,利用外观对象作为每层的入口,简化层间调用
 * 优点:
 *      1.简化了调用过程,无需了解深入子系统,防止带来风险
 *      2.减少系统依赖,松散耦合(客户端不和子系统直接交流,而是通过外观模式进行交流)
 *      3.更好的划分访问层次
 *      4.符合迪米特法则,即最少知道原则(客户端不需要了解子系统内部的实现,只需要和外观类交互就完了)
 * 缺点:
 *      1.增加子系统,扩展子系统行为容易引入风险
 *      2.不符合开闭原则
 *
 */
public class FacadeTest {


    /**
     * 现在的业务场景:
     * 某电商平台上面有积分可以换小礼物,然后需要
     * 1.资格兑换子系统(就是看你账号上积分是否足够兑换物品)
     * 2.积分支付子系统
     * 3.物流子系统
     *
     * 总结:
     *    就是说兑换这个小礼物需要走3个子系统,然后我们提供一个外观类对象(GiftExchangeService),提供统一的入口,
     *    让外观类(GiftExchangeService)去和3个子系统通信,然后我们的应用层(也就是FacadeTest这个类)只需要和外观类通信就完了
     *    应用层(FacadeTest)<=>外观类(GiftExchangeService)<=>3个子系统(QualifyService,PointsPaymentService,LogisticsService)
     */
    public static void test(){
        PointGift pointsGift = new PointGift("鼠标");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }

}
