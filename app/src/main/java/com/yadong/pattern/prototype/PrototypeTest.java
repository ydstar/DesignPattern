package com.yadong.pattern.prototype;

import com.yadong.pattern.prototype.deep_clone.Pig;
import com.yadong.pattern.prototype.shallow_clone.Mail;
import com.yadong.pattern.prototype.shallow_clone.MailUtil;

import java.util.Date;

public class PrototypeTest {

    /**
     * 原型模式
     * 定义:指原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象
     * 特征:不需要知道任何创建的细节,不调用构造函数
     * 类型:创建型
     * 适用场景:
     *         1.类初始化消耗较多资源
     *         2.new产生的一个对象需要非常繁琐的过程(属性赋值,访问权限等)
     *         3.构造函数比较复杂
     *         4.循环体中生产大量对象
     * 优点:
     *      1.原型模式性能比直接new一个对象性能高
     *      2.简化创建过程
     * 缺点:
     *      1.必须配备克隆方法(这个模式的核心就是clone方法)
     *      2.对克隆复杂对象或对克隆出的对象进行复杂改造时,容易引入风险
     *      3.深拷贝,浅拷贝要运用得当
     * 扩展:
     *      1.深克隆
     *      2.浅克隆
     */
    public static  void test() throws CloneNotSupportedException {
        shallowClone();
        deepClone();
    }

    /**
     * 浅克隆
     */
    private static void shallowClone() throws CloneNotSupportedException {
        /**
         * 下面这个例子目的是:
         * 创建一个Mail对象,然后保存初始化的内容,然后一个for循环,发送10份出去
         */
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for(int i = 0;i < 10;i++){
            //根据原始的Mai对象,去clone 一个全新的Mail对象,这个是用二进制的流的方式复制的,所以性能比较好
            //目前这个是浅拷贝
            Mail mailTemp = (Mail) mail.clone();//这个clone并没有调用构造器,只是调用了clone方法,但是对象是新的

            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@163.com");
            mailTemp.setContent("恭喜您，你中奖了,500W!!!!");

            MailUtil.sendMail(mailTemp);//发送邮件
            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        //假如现在的业务非常复杂,这个保存Mail对象需要放到最后面
        //保存原始的Mail对象
        MailUtil.saveOriginMailRecord(mail);
    }

    /**
     * 深克隆
     */
    private static void deepClone() throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();//从pig1 clone出来pig2

        /**
         * 下面的打印pig1和pig2是两个不同的对象,这个没有问题
         * 但是,里面的Date类型的mBirthday生日对象,这个是同一个对象,这个克隆出来的Date引用的是用一个对象
         * 所以修改pig1的生日,pig2也会跟着改变(这就是需要注意的点),所以需要深克隆
         */
        System.out.println(pig1);
        System.out.println(pig2);

        //改变pig1的生日日期,目的只是修改pig1的生日,并没有打算修改pig2的生日
        pig1.getBirthday().setTime(666666666666L);


        /**
         * 如果不在pig对象中的clone方法写下面这一句
         * pig.mBirthday = (Date) pig.mBirthday.clone();
         * 就会出现问题(pig2也跟着改变时间了),所以必须要深克隆,就是加上上面的代码
         */
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
