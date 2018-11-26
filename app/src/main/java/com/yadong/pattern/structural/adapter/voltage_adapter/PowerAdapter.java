package com.yadong.pattern.structural.adapter.voltage_adapter;

/**
 * 适配器
 * 把220V的电转换成5V的电,采用的是组合的方式,把AC220对象给new出来,然后实现DC5接口
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220=new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        //模拟变压器
        int adapterOutput = adapterInput/44;

        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
