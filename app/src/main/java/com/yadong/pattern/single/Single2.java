package com.yadong.pattern.single;

/**
 * 静态内部类的单例模式
 */
public class Single2 {


    public static Single2 getInstance(){
        return Holder.INSTANCE;
    }

    static class Holder{
        private static final Single2 INSTANCE=new Single2();
    }
}
