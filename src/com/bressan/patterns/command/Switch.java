package com.bressan.patterns.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * invoker class
 */
public class Switch {

    private List<Command> history = new ArrayList<>();

    /**
     * other option using map with functional interface
     */
    private HashMap<String, com.bressan.patterns.command.functional.Command> commandMap = new HashMap<>();

    public void storeAndExecute(Command command) {
        this.history.add(command);
        command.execute();
    }


    public void register(String commandName, com.bressan.patterns.command.functional.Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        com.bressan.patterns.command.functional.Command command = commandMap.get(commandName);
        if (Objects.isNull(command)) {
            throw new IllegalStateException("No command registered for " + commandName);
        }
        command.execute();
    }

}
