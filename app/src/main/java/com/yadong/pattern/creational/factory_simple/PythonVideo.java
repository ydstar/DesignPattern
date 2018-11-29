package com.yadong.pattern.creational.factory_simple;

/**
 * 步骤2.创建具体产品类（继承抽象产品类),定义生产的具体产品
 * PythonVideo,继承于BaseVideo
 */
public class PythonVideo extends BaseVideo {

    @Override
    public void produce() {
        System.out.println("生产PythonVideo");
    }

}
