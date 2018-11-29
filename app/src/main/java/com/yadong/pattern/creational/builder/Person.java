package com.yadong.pattern.creational.builder;

/**
 * 设计模型讲究的是一个平衡和业务模型的一个匹配。
 * 自己没事练手的builder模式
 * 我们要创建一个Person对象，一个Person对象需要很多参数，这属于一个复杂对象的创建。
 */
public class Person {

    private String mName;
    private int mAge;
    private String mKungFu;

    /**
     * 步骤3:Builder属性赋值给Person
     * 构造函数私有化
     * 只让下面的静态方法builder()能够创建对象
     */
    private Person(Builder builder) {
        mName = builder.getName();
        mAge = builder.getAge();
        mKungFu = builder.getKungFu();
    }

    /**
     * 步骤4:创建具体的建造者
     * 构建Person对象的构建器,就是通过Builder这个对象去构建Person对象
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * 步骤1:定义大侠的过程(Builder):定义大侠的名字,年龄和武功
     */
    public static class Builder {

        private String mName;
        private int mAge;
        private String mKungFu;

        public Builder setName(String name) {
            this.mName = name;
            return this;
        }

        public Builder setAge(int age) {
            this.mAge = age;
            return this;
        }

        public Builder setKungFu(String kungfu) {
            this.mKungFu = kungfu;
            return this;
        }

        public String getName() {
            return mName;
        }

        public int getAge() {
            return mAge;
        }

        public String getKungFu() {
            return mKungFu;
        }

        /**
         * 步骤2:构建真正的Person对象并返回
         */
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                ", mKungFu='" + mKungFu + '\'' +
                '}';
    }

}
