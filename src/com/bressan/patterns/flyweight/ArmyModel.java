package com.bressan.patterns.flyweight;

import java.util.HashSet;
import java.util.Set;

public class ArmyModel {
    private Set<Soldier> soldiers = new HashSet<>();

    public Set<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Set<Soldier> soldiers) {
        this.soldiers = soldiers;
    }
}

class Army {
    private ArmyModel armyModel;
    private double coordinateX;
    private double coordinateY;

    public ArmyModel getArmyModel() {
        return armyModel;
    }

    public void setArmyModel(ArmyModel armyModel) {
        this.armyModel = armyModel;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
}

class Soldier {
    Integer age;
    String name;

    public Soldier(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
