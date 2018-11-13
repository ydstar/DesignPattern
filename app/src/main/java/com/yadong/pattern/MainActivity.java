package com.yadong.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yadong.pattern.builder.Person;
import com.yadong.pattern.factory_abstract.base.BaseCourseFactory;
import com.yadong.pattern.factory_abstract.python_course.PythonCourseFactory;
import com.yadong.pattern.factory_abstract.java_course.JavaCourseFactory;
import com.yadong.pattern.factory_method.java_video.JavaVideoFactory;
import com.yadong.pattern.factory_method.python_video.PythonVideoFactory;
import com.yadong.pattern.factory_method.base.BaseVideo;
import com.yadong.pattern.factory_simple.JavaVideo;
import com.yadong.pattern.factory_simple.VideoFactory;
import com.yadong.pattern.observer.GirlFriendObserver;
import com.yadong.pattern.observer.MessageObservable;
import com.yadong.pattern.observer.Observer;
import com.yadong.pattern.prototype.deep_clone.Pig;
import com.yadong.pattern.prototype.shallow_clone.Mail;
import com.yadong.pattern.prototype.shallow_clone.MailUtil;
import com.yadong.pattern.proxy.AddController;
import com.yadong.pattern.proxy.ContactController;
import com.yadong.pattern.single.Single;
import com.yadong.pattern.single.Single2;
import com.yadong.pattern.strategy.duck.BaseDuck;
import com.yadong.pattern.strategy.duck.BeiJingDuck;
import com.yadong.pattern.strategy.duck.GreenHeadDuck;

import java.util.Date;

/**
 * 设计模式大全
 *
 *创建型模式
 *      |0---简单工厂模式(它不属于23种设计模式)
 *      |1---工厂方法模式
 *      |2---抽象工厂模式
 *      |3---建造者模式
 *      |4---单例模式
 *      |5---原型模式
 *
 *结构型模式
 *      |6---外观模式
 *      |7---装饰器模式
 *      |8---适配器模式
 *      |9---享元模式
 *      |10---组合模式
 *      |11---桥接模式
 *      |12---代理模式
 *
 *行为型模式
 *      |13---模板方法模式
 *      |14---迭代器模式
 *      |15---策略模式
 *      |16---解释器模式
 *      |17---观察者模式
 *      |18---备忘录模式
 *      |19---命令模式
 *      |20---中介者模式
 *      |21---责任链模式
 *      |22---访问者模式
 *      |23---状态模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 测试按钮
     */
    public void testClick(View view) {


        method1();
    }

    /*******************创建型模式***********************************************/
    /**
     * 简单工厂,它不属于GOF23种设计模式
     * 定义:由一个工厂对象决定创建出哪一种产品类的实例
     * 类型:创建型
     * 适用场景:
     *         1.工厂类负责创建的对象比较少
     *         2.客户端(应用层)只知道传入工厂类的参数,对于如何创建对象并不关心
     * 优点:
     *      1.只需要传入一个正确的参数,就可以获取你所需要的对象而无需知道其创建细节
     * 缺点:
     *      1.工厂类的职责相对过重,增加新的产品,需要修改工厂类的判断逻辑,违背开闭原则
     */
    public void method0() {
        VideoFactory videoFactory = new VideoFactory();
        //创建JavaVideo,根据类的Class字节码
        com.yadong.pattern.factory_simple.BaseVideo javaVideo = videoFactory.getVideo(JavaVideo.class);
        javaVideo.produce();

        //创建PythonVideo,根据String字符串类型
        com.yadong.pattern.factory_simple.BaseVideo pythonVideo = videoFactory.getVideo("python");
        pythonVideo.produce();
    }

    /**
     * 工厂方法
     * 定义:定义一个创建对象的接口,但是让实现这个接口的类来决定实例化哪个类,工厂方法让类的实例化推迟到子类中进行
     * 类型:创建型
     * 适用场景:
     *         1.创建对象需要大量重复的代码
     *         2.客户端(应用层)不依赖于产品类实例如何被创建,实现等细节
     *         3.一个类通过其子类来指定创建哪个对象
     *         4.创建对象的过程推迟到子类中来
     * 优点:
     *      1.用户只需要关心所需产品对应的工厂,无需关心创建细节
     *      2.加入新产品符合开闭原则,提高可扩展性
     * 缺点:
     *      1.类的个数容易过多,增加复杂度
     *      2.增加了系统的抽象性和理解难度
     *
     * 个人理解:
     *          我们只需要关心产品对应的工厂,而不需要关心其细节.然后想创建什么类就找对应的工厂.
     *          然后类的具体实例化延迟到子类工厂类中去进行
     */
    public void method1() {
        //创建JavaVideo,对应的工厂创建对应的对象
        JavaVideoFactory factory = new JavaVideoFactory();
        BaseVideo video = factory.getVideo();
        video.produce();

        //创建PythonVideo,对应的工厂创建对应的对象
        PythonVideoFactory pythonVideoFactory = new PythonVideoFactory();
        BaseVideo pythonVideo = pythonVideoFactory.getVideo();
        pythonVideo.produce();
    }

    /**
     * 抽象工厂
     * 定义:提供了一个创建一系列相关或相互依赖对象的接口
     * 特征:无须指定他们具体的类
     * 类型:创建型
     * 适用场景:
     *         1.客户端(应用层)不依赖于产品实例如何被创建,实现等细节
     *         2.强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
     *         3.提供一个产品类的库,所有的产品以同样的接口出现,从而使客户端不依赖于具体实现
     * 优点:
     *      1.具体产品在应用层代码隔离,无需关心创建细节
     *      2.将一个系列的产品族统一到一起创建
     * 缺点:
     *      1.规定了所有可能被创建的产品集合,产品族中扩展新的产品困难,需要修改抽象工厂的接口
     *      2.增加了系统的抽象性和理解难度
     */
    public void method2() {
        //通过JavaCourseFactory去创建javaVideo和JavaNote
        BaseCourseFactory courseFactory = new JavaCourseFactory();//创建Java课程工厂
        courseFactory.getVideo().produce();//通过工厂类得到JavaVideo对象并进行创建
        courseFactory.getNote().produce();//通过工厂类得到JavaNote对象并进行创建


        //通过PythonCourseFactory去创建pythonVideo和PythonNote
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();//创建Python课程工厂
        pythonCourseFactory.getVideo().produce();//通过工厂类得到PythonVideo对象并进行创建
        pythonCourseFactory.getNote().produce();//通过工厂类得到PythonNote对象并进行创建
    }

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
    public void method3() {
        Person person = Person.builder()
                .setName("风清扬")
                .setAge(99)
                .setKungFu("独孤九剑")
                .build();
        System.out.println(person.toString());
    }


    /**
     * 单例设计模式
     * 特征:
     * 类型:创建型
     */
    public void method4() {
        Single instance = Single.getInstance();
        Single2 single2 = Single2.getInstance();
    }

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
    public void method5() throws CloneNotSupportedException {
        //shallowClone();
        deepClone();
    }

    /**
     * 浅克隆
     */
    private void shallowClone() throws CloneNotSupportedException {
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
    private void deepClone() throws CloneNotSupportedException {
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


    /*******************结构型模式*******************************************************************/

    /**
     * 外观模式
     */
    public void method6() {

    }

    /**
     * 装饰器模式
     */
    public void method7() {

    }

    /**
     * 适配器模式
     */
    public void method8() {

    }

    /**
     * 享元模式
     */
    public void method9() {

    }

    /**
     * 组合模式
     */
    public void method10() {

    }

    /**
     * 桥接模式
     */
    public void method11() {

    }

    /**
     * 代理模式
     * 通过接口的方式 传递数据
     * 现在有一个 添加页面,联系人页面,当在添加页面中添加数据的时候,要把数据传递到联系人页面显示
     * <p>
     * 1.先定义接口,该接口中,有一个方法,这个方法有两个参数,1.要传出去数据的那个页面对象 2.数据
     * 2.联系人页面ContactController 实现这个接口,和实现方法(此时ContactController是接口的实现类)
     * 2.AddController中持有接口的字段,把上面这个接口的实现类赋值给AddController中的接口字段
     * 3.当添加页面中的添加事件被触发的时候,让这个接口的实现类调用接口中的方法,从而实现了数据的传递
     * <p>
     * 委托方和代理方
     * 委托方定义接口和使用接口中的方法
     * 代理方把代理对象传给委托方并实现委托方的接口,从而实现代理模式
     */
    public void method12() {
        AddController addController = new AddController();
        ContactController contactController = new ContactController();

        //代理方把代理对象传给委托方
        addController.mDataInterface = contactController;
        addController.addEvent();
    }

    /*******************行为型模式*******************************************************************/


    /**
     * 模板方法模式
     */
    public void method13() {

    }

    /**
     * 迭代器模式
     */
    public void method14() {

    }

    /**
     * 策略模式
     * 分别封装行为接口,实现算法族,父类中放行为接口对象,在子类里具体设定行为对象
     * 原则:分离变化部分,封装接口,基于接口编程各种功能.
     * 此模式让行为算法的变化独立于算法的使用者
     * <p>
     * 鸭子项目中,飞行或者叫声等行为是变化的(能飞和不能飞),这个需要抽象成接口,然后放在鸭子的父类中,让子类鸭子去实现
     */
    public void method15() {
        BaseDuck beiJingDuck = new BeiJingDuck();
        BaseDuck greenHeadDuck = new GreenHeadDuck();
        beiJingDuck.display();
        greenHeadDuck.fly();
        beiJingDuck.display();
        greenHeadDuck.fly();
    }

    /**
     * 解释器模式
     */
    public void method16() {

    }

    /**
     * 观察者模式
     */
    public void method17() {
        //创建2个观察者
        Observer fanbingbing = new GirlFriendObserver("范冰冰");
        Observer yangmi = new GirlFriendObserver("杨幂");

        //创建被观察者
        MessageObservable messageSubject = new MessageObservable();

        //被观察者 添加 观察者 到集合中
        messageSubject.attach(fanbingbing);
        messageSubject.attach(yangmi);
        //被观察者 通知 观察者,我都干了什么
        messageSubject.change("我在大保健");

        messageSubject.dettch(yangmi);
        messageSubject.notyfyObservers("泡吧");
    }

    /**
     * 备忘录模式
     */
    public void method18() {

    }

    /**
     * 命令模式
     */
    public void method19() {

    }

    /**
     * 中介者模式
     */
    public void method20() {

    }

    /**
     * 责任链模式
     */
    public void method21() {

    }

    /**
     * 访问者模式
     */
    public void method22() {

    }

    /**
     * 状态模式
     */
    public void method23() {

    }



}
