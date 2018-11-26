package com.yadong.pattern.structural.adapter.voltage_adapter;

/**
 * 220V的电压
 */
public class AC220 {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
