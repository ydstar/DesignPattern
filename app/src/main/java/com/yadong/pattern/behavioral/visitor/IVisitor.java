package com.yadong.pattern.behavioral.visitor;

/**
 *Visitor 接口
 */
public interface IVisitor {

    //访问免费课程
    void visit(FreeCourse freeCourse);

    //访问付费课程
    void visit(CodingCourse codingCourse);


}
