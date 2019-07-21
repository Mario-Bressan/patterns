package com.bressan.patterns.command;

/**
 * class of the object that would receive the command
 */
public class Actor {

    public void jump() {
        System.out.println("Jumping");
    }

    public void fireWithGun() {
        System.out.println("Shoting with gun");
    }

    public void punch() {
        System.out.println("Punching");
    }
}
