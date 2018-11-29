package com.yadong.pattern.creational.factory_method.python_video;

import com.yadong.pattern.creational.factory_method.base.VideoProduct;

/**
 * 步骤3:创建具体产品类(继承抽象产品类),定义生产的具体产品；
 * PythonVideo是继承BaseVideo的
 */
public class PythonVideo extends VideoProduct {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
