package com.itacademy.java.oop.basics_2.task_2;

public class Speedometer {
    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return Bike.MOUNTAIN;
        }
        if (roadBike.getSpeed() > mountainBike.getSpeed()) {
            return Bike.ROAD;
        }
        return null;
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        }
        if (roadBikeSpeed > mountainBikeSpeed) {
            return Bike.ROAD;
        }
        return null;
    }
}
