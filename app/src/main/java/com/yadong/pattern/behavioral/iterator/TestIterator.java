package com.yadong.pattern.behavioral.iterator;

/**
 * 迭代器模式
 * 定义:提供一种方法,顺序访问一个集合对象中的各个元素,而又不暴露该对象的内部表示
 * 类型:行为型
 *
 * 适用场景:
 *      1.访问一个集合对象的内容而无需暴露它的内部表示
 *      2.为遍历不同的集合结构提供一个统一的接口
 * 优点:
 *      1.分离了集合对象的遍历行为
 * 缺点:
 *      1.类的个数成对增加
 */
public class TestIterator {


    /**
     * 其实迭代器模式一般自己手动实现的不多,都是用的别人写好的
     * 场景:网上有很多学习Java的课程
     * 目的:然后想通过迭代器模式去进行遍历并打印
     */
    public static void  test(){
        //创建3个课程
        Course course1 = new Course("Java基础");
        Course course2 = new Course("Android基础");
        Course course3 = new Course("Java设计模式");

        //把这3个课程添加到课程集合类中
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);


        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);
        //删除课程3(Java设计模式)
        courseAggregate.removeCourse(course3);
        System.out.println("-----删除操作之后的课程列表-----");
        printCourses(courseAggregate);
    }

    /**
     * 遍历迭代器并打印课程的名字
     */
    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }


    
}
