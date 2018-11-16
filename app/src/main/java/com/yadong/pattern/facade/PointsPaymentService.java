package com.yadong.pattern.facade;

/**
 * 积分支付子系统
 */
public class PointsPaymentService {
    public boolean pay(PointGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }

}
