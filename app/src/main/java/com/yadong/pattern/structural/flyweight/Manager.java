package com.yadong.pattern.structural.flyweight;

/**
 * 部门经理 也属于员工
 */
public class Manager implements Employee {

    private String department;//所属部门
    private String reportContent;//报告内容

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }


    /**
     * 设置报告内容
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

}
