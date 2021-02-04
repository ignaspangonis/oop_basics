package com.itacademy.java.oop.basics_2.task_2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        mountainBike.changeGear(100);
        mountainBike.speedUp(20);
        roadBike.speedUp(30);
        roadBike.applyBrakes(10);
        roadBike.changeGear(2);
        Bike winner = Speedometer.chooseWinner(mountainBike, roadBike);
        System.out.println("----\nWinner: " +
                (winner == null ? "Both are equal! Socialism!" : winner) + "\n----");
    }
}
