package com.yadong.pattern.behavioral.iterator;

/**
 * 课程迭代器的接口类
 */
public interface CourseIterator {
    /**
     * 获取下个一个课程
     */
    Course nextCourse();

    /**
     * 是不是下一个课程
     */
    boolean isLastCourse();

}
