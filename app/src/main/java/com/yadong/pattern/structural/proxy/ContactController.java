package com.yadong.pattern.structural.proxy;

/**
 *
 * 代理方,实现接口
 *
 *
 * 联系人页面
 *
 */

//实现接口
public class ContactController implements  DataInterface{

    @Override
    public void addData(AddController page, String name) {

        System.out.println("ContactController 添加数据成功 "+page.toString()+ "  名字:"+ name);
    }
}
