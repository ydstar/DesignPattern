package com.yadong.pattern.single;

/**
 * 双重校验的懒汉式单例模式
 * 但是反射依然可以破解懒汉式单例,因为如果反射先进来,就可以拿到这个类的所有东西,然后创建对象
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {

        /**
         * 防止反射破解,这一招对饿汉式和静态内部类都好使,对懒汉式不好使
         * 因为,如果反射的创建方式先进来,就能直接创建对象.
         * 然后正常的创建方式后进来,又能创建对象,就把这个单例破坏了.
         */
        if(mInstance!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static LazyDoubleCheckSingleton mInstance = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (mInstance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (mInstance == null) {
                    mInstance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return mInstance;
    }

}
