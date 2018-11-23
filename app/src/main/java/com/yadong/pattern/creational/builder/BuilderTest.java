package com.yadong.pattern.creational.builder;

public class BuilderTest {

    /**
     * 建造者模式
     * 定义:将一个复杂的对象的构建和它的表示分离,使得同样的构建过程可以创建不同的表示
     * 特征:用户只需指定需要建造的类型就可以得到它们,建造过程和细节不需要知道
     * 类型:创建型
     * 适用场景:
     *         1.如果一个对象有非常复杂的内部结构(很多属性字段)
     *         2.想把复杂对象的创建和使用分离
     * 优点:
     *      1.封装性好,创建和使用分离。
     *      2.扩展性好,建造类之间独立,一定程度上解耦
     * 缺点:
     *      1.产生多余的Builder对象。
     *      2.产品内部发生变化,建造者都要修改,成本比较大
     */
    public static void test() {
        Person person = Person.builder()
                .setName("风清扬")
                .setAge(99)
                .setKungFu("独孤九剑")
                .build();
        System.out.println(person.toString());
    }
}
