package com.yadong.pattern.behavioral.visitor;

/**
 *课程
 */
public abstract class Course {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //是否接受访问
    public abstract void accept(IVisitor visitor);

}
