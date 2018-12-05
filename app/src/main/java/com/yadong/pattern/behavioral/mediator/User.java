package com.yadong.pattern.behavioral.mediator;

/**
 *
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 交给中介者展示信息
     * @param message
     */
    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
