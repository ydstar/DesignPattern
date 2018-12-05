package com.yadong.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 第4步,创建工作人员类
 * 可以执行一组命令
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();
    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
