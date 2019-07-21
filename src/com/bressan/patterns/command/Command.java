package com.bressan.patterns.command;

/**
 * abstract class of command
 */
public abstract class Command {
    protected Actor actor;

    public Command(Actor actor) {
        this.actor = actor;
    }

    public abstract void execute();
}

/**
 * concrete classes representing the available commands
 */
class PunchCommand extends Command {

    public PunchCommand(Actor actor) {
        super(actor);
    }

    @Override
    public void execute() {
        actor.punch();
    }
}

class FireCommand extends Command {

    public FireCommand(Actor actor) {
        super(actor);
    }

    @Override
    public void execute() {
        actor.fireWithGun();
    }
}

class JumpCommand extends Command {

    public JumpCommand(Actor actor) {
        super(actor);
    }

    @Override
    public void execute() {
        actor.jump();
    }
}
