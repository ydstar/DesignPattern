package com.yadong.pattern.proxy;

/**
 * 委托方,一般下,委托方定义接口(就是DataInterface)
 *
 * 添加数据 页面
 */

public class AddController {


    //定义接口
    public DataInterface mDataInterface;


    public void  addEvent(){

        //使用接口中的方法
        mDataInterface.addData(this,"黄晓明");
    }

}


