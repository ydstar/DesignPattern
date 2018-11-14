package com.yadong.pattern.single;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonTest {

    /**
     * 单例设计模式
     * 定义:保证一个类仅有一个实例,并提供一个全局访问点
     * 类型:创建型
     * 适用场景:
     *         1.想确保任何情况下都绝对只有一个实例
     * 优点:
     *      1.在内存里只有一个实例,减少了内存开销
     *      2.可以避免对资源的多重占用
     *      3.设置了全局访问点,严格控制访问
     * 缺点:
     *      1.没有接口,扩展困难
     * 扩展:
     *      1.线程安全
     *      2.延迟加载
     *      3.序列化和反序列化安全
     *      4.反射可以破解懒汉式(哪怕双重校验加锁也不好使),但是饿汉式和静态内部类可以防御
     *
     */
    public static void test()throws Exception {
        staticInnerClassSingleton();//静态内部类方式,通过反射的方式去破解单例,可以防御
        hungrySingleton1();//饿汉式,通过序列化的方式去破解单例,可以防御
        hungrySingleton2();//饿汉式,通过反射的方式去破解单例,可以防御
        LazyDoubleCheckSingleton();//懒汉式,通过反射的方式去破解单例,防御不了!!!!!!
        enumInstance();//枚举式,免疫反射和序列化破解单例
    }

    /**
     * 静态内部类单例
     */
    private static void staticInnerClassSingleton() {
        StaticInnerClassSingleton single2 = StaticInnerClassSingleton.getInstance();
    }

    /**
     * 饿汉式
     * 通过序列化的方式去破解单例,可以防御
     */
    private static void hungrySingleton1() throws Exception{
        HungrySingleton singleton = HungrySingleton.getInstance();

        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        //把该对象序列化到本地文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(absolutePath+"/singleton_file"));
        oos.writeObject(singleton);

        //然后在取出来
        File file = new File(absolutePath+"/singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        //比较其地址值
        System.out.println("singleton: "+singleton);
        System.out.println("newInstance"+newInstance);
        System.out.println(singleton==newInstance);
    }

    /**
     * 饿汉式
     * 通过反射的方式去破解单例,可以防御
     */
    private static void hungrySingleton2() throws Exception{
        //正常方式创建对象
        HungrySingleton oldInstance = HungrySingleton.getInstance();

        //反射的方式创建
        Class  objectClass= HungrySingleton.class;
        Constructor constructor =objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);//暴力访问
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();


        //比较其地址值
        System.out.println("oldInstance: "+oldInstance);
        System.out.println("newInstance"+newInstance);
        System.out.println(oldInstance==newInstance);
    }

    /**
     * 双重校验懒汉式单例
     * 通过反射的方式去破解单例,防御不了,哪怕在构造方法中进行判断,抛出异常,依然防御不了.
     * 因为如果多线程的话,反射的创建方式有可能先进来,就能创建对象.
     * 然后正常方式创建对象,又创建了对象.
     */
    private static void LazyDoubleCheckSingleton() throws Exception {
        //反射的方式创建
        Class  objectClass= LazyDoubleCheckSingleton.class;
        Constructor constructor =objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);//暴力访问
        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) constructor.newInstance();

        //正常方式创建
        LazyDoubleCheckSingleton oldInstance = LazyDoubleCheckSingleton.getInstance();

        //比较其地址值
        System.out.println("oldInstance: "+oldInstance);
        System.out.println("newInstance"+newInstance);
        System.out.println(oldInstance==newInstance);
    }

    /**
     * 枚举的单例模式
     * 反射破解不了单例,然后序列化也破解不了单例
     */
    private static void enumInstance() {
        //正常方式创建
        EnumInstance oldInstance = EnumInstance.getInstance();
        Object newData = oldInstance.getData();
    }
}
