package com.bressan.patterns.decorator;

public class Star extends TreeDecorator {
    public Star(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithStar();
    }

    private String decorateWithStar() {
        return " with Star";
    }
}
