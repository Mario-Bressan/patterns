package com.bressan.patterns.command;

/**
 * test class
 */
public class InputHandler {
    public static void main(String[] args) {
        Actor actor = new Actor();
        Command jumpCommand = new JumpCommand(actor);
        Command punchCommand = new PunchCommand(actor);
        Command fireCommand = new FireCommand(actor);

        String command = "punch";

        Switch mySwitch = new Switch();

        switch (command) {
            case "punch":
                mySwitch.storeAndExecute(punchCommand);
                break;
            case "jump":
                mySwitch.storeAndExecute(jumpCommand);
                break;
            case "fire":
                mySwitch.storeAndExecute(fireCommand);
        }

        commandWithFunctionalInterface();
    }

    /**
     * using functional interface
     */
    static void commandWithFunctionalInterface() {
        System.out.println("Using command pattern with functional interface");
        Actor actor = new Actor();

        com.bressan.patterns.command.functional.Command jumpCommand = actor::jump;
        com.bressan.patterns.command.functional.Command punchCommand = actor::punch;

        Switch mySwitch = new Switch();
        mySwitch.register("jump", jumpCommand);
        mySwitch.register("punch", punchCommand);

        mySwitch.execute("jump");
        mySwitch.execute("punch");
    }
}
