package com.yadong.pattern.structural.composite;

/**
 * 组合模式
 * 定义:将对象组合成树形结构以表示【部分-整体】的层次结构
 * 特征:组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * 类型:结构型
 * 适用场景:
 *         1.希望客户端可以忽略组合对象与单个对象的差异时
 *         2.处理一个树形结构时
 * 优点:
 *         1.清楚的定义分层次的复杂对象,表示对象的全部或部分层次
 *         2.让客户端忽略了层次的差异,方便对整个层次结构进行控制
 *         3.简化客户端的代码
 *         4.符合开闭原则
 * 缺点:
 *         1.限制类型时会较为复杂
 *         2.使设计变的更加抽象
 */
public class CompositeTest {


    /**
     * 场景:有很多课程,然后也有很多目录,需要把这些课程进行树桩结构分类
     */
    public static void test() {
        //二级目录
        CatalogComponent operatingSystem = new CourseCatalog("操作系统课程目录",2);
        CatalogComponent linuxCourse = new Course("Linux课程",100);
        CatalogComponent windowsCourse = new Course("Windows课程",120);
        operatingSystem.add(linuxCourse);
        operatingSystem.add(windowsCourse);


        //二级目录
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
        CatalogComponent javaBase = new Course("Java基础",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);
        javaCourseCatalog.add(javaBase);
        javaCourseCatalog.add(designPattern);


        //一级目录(主目录)
        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);
        mainCourseCatalog.print();

    }

}
