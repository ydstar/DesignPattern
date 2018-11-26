package com.yadong.pattern.structural.flyweight;


/**
 * 享元
 * 定义:提供了减少对象数量从而改善应用所需的对象结构的方式
 * 特征:运用共享技术有效地支持大量细粒度的对象
 * 类型:结构型
 * 适用场景:
 * 1.常常应用于系统底层的开发,以便解决系统的性能问题
 * 2.系统有大量相似对象,需要缓冲池的场景
 * 优点:
 * 1.减少对象的创建,降低内存中对象的数量,降低系统的内存,提高效率
 * 2.减少内存之外的其他资源占用
 * 缺点:
 * 1.关注内/外部状态,关注线程安全问题
 * 2.使系统,程序的逻辑复杂化
 * 扩展:
 * 1.内部状态, 可以认为是享元对象的属性,不随着环境的改变而改变
 * 2.外部状态,通过方法的参数传过来一个状态,会随着环境的改变而改变
 */
public class FlyweightTest {


    private static final String departments[] = {"技术", "综合管理", "人事", "销售"};


    /**
     * 背景:年底了,部门经理需要做报告
     */
    public static void test() {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }

    }


}
