package com.yadong.pattern.creational.factory_simple;

/**
 * VideoFactory,工厂类,根据类型去生产具体的对象
 */
public class VideoFactory {

    /**
     * 根据Class字节码对象去得到对应的对象
     */
    public BaseVideo getVideo(Class c){
        BaseVideo video=null;
        try {
            video = (BaseVideo) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     * 根据type类型去得到对应的对象
     */
    public BaseVideo getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
