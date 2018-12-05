package com.yadong.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 中介者,可以理解为一个群,大家都可以在这里面说话
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
