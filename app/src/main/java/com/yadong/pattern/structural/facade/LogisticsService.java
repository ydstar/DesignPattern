package com.yadong.pattern.structural.facade;

/**
 * 物流服务子系统
 */
public class LogisticsService {

    public String shipGift(PointGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String logisticsOrderNo = "666";//物流订单ID
        return logisticsOrderNo;
    }
}
