package com.itacademy.java.oop.basics_2.task_2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;


    public int getSpeed() {
        return speed;
    }

    public MountainBike() {
        gear = 0;
        speed = 0;
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void printNewSpeed() {
        System.out.println("New speed: " + speed);
    }

    @Override
    public void printType() {
        System.out.print("Mountain Bike: ");
    }

    @Override
    public void changeGear(int interval) {
        printType();
        if (interval != 1 && interval != -1) {
            System.out.println("Can only change gear by 1 or -1. Please use these intervals.");
            return;
        } else if (gear + interval < 0) {
            System.out.println("Cannot change gear - it would go over the value 20 or below 0");
            return;
        }
        gear += interval;
        System.out.println("New gear: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        printType();
        int result = speed + increment;
        if (increment < 0) {
            System.out.println("Cannot increment negatively. Please use positive numbers to speed up a mountain bike.");
            return;
        } else if (result > 100) {
            System.out.println("Speed is too high. Highest possible increment: " + (100 - speed));
            return;
        }
        speed = result;
        printNewSpeed();
    }

    @Override
    public void applyBrakes(int decrement) {
        printType();
        int result = speed - decrement;

        // Handling exceptions
        if (decrement < 0) {
            System.out.println("Braking value cannot be negative. Please use positive numbers to brake a mountain bike.");
            return;
        } else if (result < -10) {
            System.out.println("Braking value for the mountain bike is too high. The highest possible is "
                    + (speed + 10));
            return;
        }
        speed = result;
        printNewSpeed();
    }
}
