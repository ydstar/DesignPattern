package com.yadong.pattern.creational.prototype.deep_clone;

import java.util.Date;

/**
 * 深拷贝
 */
public class Pig implements Cloneable{
    private String mName;
    private Date mBirthday;

    public Pig(String name, Date birthday) {
        this.mName = name;
        this.mBirthday = birthday;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public Date getBirthday() {
        return mBirthday;
    }

    public void setBirthday(Date birthday) {
        this.mBirthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + mName + '\'' +
                ", birthday=" + mBirthday +
                '}'+super.toString();
    }

    /**
     * 重写clone 方法
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

        //深克隆
        Pig pig = (Pig)super.clone();
        pig.mBirthday = (Date) pig.mBirthday.clone();

        return pig;
    }


}
