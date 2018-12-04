package com.yadong.pattern.behavioral.iterator;

/**
 * 课程的集合 接口
 */
public interface CourseAggregate {

    /**
     * 添加课程
     */
    void addCourse(Course course);

    /**
     * 删除课程
     */
    void removeCourse(Course course);

    /**
     * 课程迭代器
     */
    CourseIterator getCourseIterator();


}
