package com.yadong.pattern.behavioral.interpreter;

/**
 * 解释器模式
 * 定义:给定一个语言,定义它的文法的一种表示,并定义一个解释器,这个解释器使用该表示来解释语言中的句子
 * 特征:为了解释一种语言,而为语言创建的解释器
 * 类型:行为型
 *
 * 适用场景:
 *      1.某个特定类型问题发生频率足够高
 * 优点:
 *      1.语法由很多类表示,容易改变和扩展此"语言"
 * 缺点:
 *      1.当语法规则数目太多时,增加了系统复杂度
 *
 * 非常低频的一个设计模式
 */
public class TestInterpreter {


    /**
     * 场景:输入一个字符串,通过自定义解释器,去得到一个结果
     */
    public static void test() {
        //输入字符串,自己定义的一套算法
        String geelyInputStr="6 100 11 + *";
        MyExpressionParser expressionParser=new MyExpressionParser();
        int result=expressionParser.parse(geelyInputStr);
        /**
         * 结果:
         * 100+11=111 111*6=666
         */
        System.out.println("解释器计算结果: "+result);
    }
}
