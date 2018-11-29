package com.yadong.pattern.creational.single;

/**
 * 静态内部类的单例模式
 */
public class StaticInnerClassSingleton {


    //步骤1:构造函数私有化
    private StaticInnerClassSingleton(){
        //防止反射破解,这一招对饿汉式和静态内部类单例都好使,对懒汉式不好使
        if(Holder.INSTANCE!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    //步骤3:对外提供一个静态方法
    public static StaticInnerClassSingleton getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * 步骤2:创建静态内部类对象
     * 静态内部类
     */
    private static class Holder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
