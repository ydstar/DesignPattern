package com.yadong.pattern.structural.proxy;

public class ProxyTest {

    /**
     * 代理模式
     * 通过接口的方式 传递数据
     * 现在有一个 添加页面,联系人页面,当在添加页面中添加数据的时候,要把数据传递到联系人页面显示
     * <p>
     * 1.先定义接口,该接口中,有一个方法,这个方法有两个参数,1.要传出去数据的那个页面对象 2.数据
     * 2.联系人页面ContactController 实现这个接口,和实现方法(此时ContactController是接口的实现类)
     * 2.AddController中持有接口的字段,把上面这个接口的实现类赋值给AddController中的接口字段
     * 3.当添加页面中的添加事件被触发的时候,让这个接口的实现类调用接口中的方法,从而实现了数据的传递
     * <p>
     * 委托方和代理方
     * 委托方定义接口和使用接口中的方法
     * 代理方把代理对象传给委托方并实现委托方的接口,从而实现代理模式
     */
    public static void test() {
        AddController addController = new AddController();
        ContactController contactController = new ContactController();

        //代理方把代理对象传给委托方
        addController.mDataInterface = contactController;
        addController.addEvent();
    }
}
