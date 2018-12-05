package com.yadong.pattern.behavioral.chain_of_responsibility;

/**
 * 创建抽象的批准者类
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void deploy(Course course);
}
