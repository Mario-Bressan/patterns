package com.bressan.patterns.flyweight;

public class HandleArmy {

    public static void main(String[] args) {
        ArmyModel armyModel = new ArmyModel();
        for (int i = 0; i <=1000000; i++) {
            Soldier soldier = new Soldier(25, "SoldierName");
            armyModel.getSoldiers().add(soldier);
        }

        Army army = new Army();
        army.setArmyModel(armyModel);
        army.setCoordinateX(1.7865);
        army.setCoordinateY(4.9745748798759234592);

        Army otherArmy = new Army();
        otherArmy.setArmyModel(armyModel);
        otherArmy.setCoordinateY(5.345452960);
        otherArmy.setCoordinateX(9.562525260827);
    }
}
