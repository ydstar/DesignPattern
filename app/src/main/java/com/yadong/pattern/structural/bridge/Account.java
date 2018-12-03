package com.yadong.pattern.structural.bridge;

/**
 * 账号
 */
public interface Account {
    //打开账号
    Account openAccount();

    //查看账号的类型(是活期还是定期)
    void showAccountType();

}
