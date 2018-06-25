package com.yadong.pattern.builder;

/**
 * 自己没事练手的builder模式
 */
public class Person {


    private  String name;
    private  int age;

    public Person(Builder builder){
        name = builder.getName();
        age = builder.getAge();
    }

    public static Builder builder(){
        return  new Builder();
    }

    public static class Builder{

        private String name;
        private int age;

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
