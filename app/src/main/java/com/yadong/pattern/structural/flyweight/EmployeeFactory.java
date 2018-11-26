package com.yadong.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工 工厂
 */
public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();


    /**
     * 根据部门去获取部门经理
     */
    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);

            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);

            //存到map集合中
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }

}
