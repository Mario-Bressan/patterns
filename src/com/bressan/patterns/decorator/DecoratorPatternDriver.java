package com.bressan.patterns.decorator;

public class DecoratorPatternDriver {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImpl();

        ChristmasTree christmasTree1 = new BubbleLights(new Star(new ChristmasTreeImpl()));

        System.out.println(christmasTree.decorate());
        System.out.println(christmasTree1.decorate());
    }
}
