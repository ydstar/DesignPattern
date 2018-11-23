package com.yadong.pattern.structural.facade;

/**
 * 外观类
 *
 * 应用层(FacadeTest)不和这3个子系统通信,只是和外观类(GiftExchangeService)通信,然后外观类和3个子系统通信
 * 应用层(FacadeTest)<=>外观类(GiftExchangeService)<=>3个子系统(QualifyService,PointsPaymentService,LogisticsService)
 */
public class GiftExchangeService {

    private QualifyService mQualifyService = new QualifyService();//资格兑换子系统
    private PointsPaymentService mPointsPaymentService = new PointsPaymentService();//积分支付子系统
    private LogisticsService mLogisticsService = new LogisticsService();//物流子系统

    public void giftExchange(PointGift pointsGift){
        if(mQualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(mPointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = mLogisticsService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
