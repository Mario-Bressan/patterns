package com.bressan.patterns.state;

import static java.lang.System.*;

public class TestState {
    public static void main(String[] args) {
        Package pkg = new Package();

        pkg.printStatus();
        out.println((pkg.getState() instanceof OrderedState));

        pkg.nextState();

        pkg.printStatus();
        out.println(pkg.getState() instanceof DeliveredState);

        pkg.nextState();

        pkg.printStatus();
        out.println(pkg.getState() instanceof  ReceivedState);

    }
}
