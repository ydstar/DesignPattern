package com.yadong.pattern.creational.single;

import java.io.Serializable;

/**
 * 饿汉式
 * 1.构造函数私有化
 * 2.创建全局静态final变量
 * 3.对外提供一个静态方法
 */
public class HungrySingleton implements Serializable{

    private HungrySingleton() {
        //防止反射破解,这一招对饿汉式和静态内部类都好使,对懒汉式不好使
        if(HUNGRYSINGLETON!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static final HungrySingleton HUNGRYSINGLETON = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return HUNGRYSINGLETON;
    }

    /**
     * 一旦单例模式涉及到序列化和反序列化,一定要小心单例被破坏掉
     * 这个方法是反射调用的,如果不写这个方法,序列化就会破坏单例(翻看ObjectInputStream源码得知的)
     */
    private Object readResolve(){
        return HUNGRYSINGLETON;
    }

}
