package com.yadong.pattern.structural.bridge;

/**
 * 银行
 */
public abstract class Bank {
    //通过组合的方式建立两个类的连线
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
