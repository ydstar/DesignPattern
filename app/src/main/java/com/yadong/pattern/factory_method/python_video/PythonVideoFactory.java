package com.yadong.pattern.factory_method.python_video;

import com.yadong.pattern.factory_method.base.BaseVideo;
import com.yadong.pattern.factory_method.base.BaseVideoFactory;

/**
 * PythonVideo的工厂类实现BaseVideoFactory接口,延迟到子类中来创建具体的对象
 * 总而言之就是,什么工厂创建什么对象,PythonVideoFactory工厂就创建PythonVideo
 */
public class PythonVideoFactory implements BaseVideoFactory {

    /**
     * 工厂方法
     */
    @Override
    public BaseVideo getVideo() {
        return new PythonVideo();
    }
}
