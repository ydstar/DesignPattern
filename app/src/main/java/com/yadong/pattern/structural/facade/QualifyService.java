package com.yadong.pattern.structural.facade;

/**
 * 资格兑换子系统
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
