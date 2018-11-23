package com.yadong.pattern.creational.single;

/**
 * 静态内部类的单例模式
 */
public class StaticInnerClassSingleton {


    private StaticInnerClassSingleton(){
        //防止反射破解,这一招对饿汉式和静态内部类单例都好使,对懒汉式不好使
        if(Holder.INSTANCE!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * 静态内部类
     */
    private static class Holder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
