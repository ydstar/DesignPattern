## Design Patterns(设计模式)

### 设计原则：
* 单一职责原则 Single Responsibility Principle
* 对扩展开放,对修改关闭

### 创建型模式
* [简单工厂模式(Simple Factoty)](https://www.jianshu.com/p/ceb5131b5953)
* [工厂方法模式(Method Factoty)](https://www.jianshu.com/p/4fbe55b172b7)
* [抽象工厂模式(Abstarct Factory)](https://www.jianshu.com/p/84a253651b21)
* [建造者模式(Builder)](https://www.jianshu.com/p/c7541ce6672a)
    >用于创建复合对象
* [单例模式(Singleton)](https://www.jianshu.com/p/e0831dad87b5)
* [原型模式(prototype)](https://www.jianshu.com/p/c16ef296c1f9)
    >对象的拷贝

### 结构型模式
* [外观模式(facade)](https://www.jianshu.com/p/3241c99e0724)
    >简化接口,降低复杂性(ps: 即定义一个高级接口,操作一系列接口)
* [装饰器模式(decorator)](https://www.jianshu.com/p/a21c3599fe5e)
    >不改变接口的情况下,添加责任;
    例子 javaI/O
* [适配器模式(adapter)](https://www.jianshu.com/p/acc82da59762)
    >接口转换
* [享元模式(Flyweight)](https://www.jianshu.com/p/8e6d4a692a56)
    >采用一个共享来避免大量拥有相同内容对象的开销
* [组合模式(composite)](https://www.jianshu.com/p/bc973a1c024a)
    >对象组合成树状结构,实现统一处理个别对象及对象组合
* [桥接模式(bridge)](https://www.jianshu.com/p/fc82a284177e)
    >主要特点是把抽象（abstraction）与行为实现（implementation）分离开来，
    从而可以保持各部分的独立性以及应对它们的功能扩展
* [代理模式(proxy)](https://www.jianshu.com/p/19a1abb629b0)
    >为另一个对象提供一个对象或占位符以控制对这个对象的访问

### 行为型模式
* [模板方法模式(template)](https://www.jianshu.com/p/380a437f7303)
    >在一个方法内定义一个算法的骨架,具体算法步骤有由子类实现,
    例如:数组的 sort方法
* [迭代器模式(Iterator pattern)](https://www.jianshu.com/p/0ad3521cc4fa)
    >提供统一的方法顺序访问聚合对象的每个元素,而又不暴露内部细节;
* [策略模式(strategy pattern)](https://www.jianshu.com/p/cdfe4c5041af)
    > 定义算法族,分别封装,各算法间可相互替换,一般由调用算法族的类组合算法
    与状态模式类似,都可以动态改变行为(算法)区别在于状态模式由状态类控制行为的改变
* [解释器模式(interpreter)](https://www.jianshu.com/p/be983cc8706b)
    >用于解析语法树
* [观察者模式(Observer)](https://www.jianshu.com/p/f1a93aec7068)
* [备忘录模式(memento)](https://www.jianshu.com/p/9e853a4c4905)
    >存储一个对象的内部状态,用于恢复;
    发起人:记录当前内部状态;定义备份的范围,负责创建和恢复数据;
    备忘录:负责存储状态;
    管理者:对备忘录进行管理
* [命令模式(command)](https://www.jianshu.com/p/6fc9f869a935)
* [中介者模式(mediator)](https://www.jianshu.com/p/54989f21022e)
    >用一个中介对象（中介者）来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
* [责任链模式(Chain of Responsibility)](https://www.jianshu.com/p/3f0a7835dbe9)
    >很多对象由每一个对象对其下家的引用而连接起来形成一条链
    例如:对申请审批的流转,权限不足向上流转直达有满足权限的人处理
* [访问者模式(visitor)](https://www.jianshu.com/p/33b8cdc608fb)
    >(方法重载)根据访问者的不同执行不同的方法
* [状态模式(Pattern of Objects for States）](https://www.jianshu.com/p/7dfe1e21ebd6)
    >允许对象在内部状态改变是改变他的行为;行为的改变一般由状态类控制



