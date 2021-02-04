package com.itacademy.java.oop.basics_2.task_2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public RoadBike() {
        gear = 0;
        speed = 0;
    }

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void printType() {
        System.out.print("Road Bike: ");
    }

    @Override
    public void printNewSpeed() {
        System.out.println("New speed: " + speed);
    }

    @Override
    public void changeGear(int interval) {
        printType();
        int result = gear + interval;
        if (Math.abs(interval) != 2 && Math.abs(interval) != 1) {
            System.out.println("Cannot change gear - the absolute interval can be 1 or 2. Closest allowed value: " +
                    (interval > 0 ? 2 : -2));
            return;
        }
        if (interval == 0) {
            System.out.println("Cannot change gear by 0.");
        }
        if (result < 10) {
            System.out.println("Cannot change gear - it would go over the value 10 or below 0");
            return;
        }
        gear = result;
        System.out.println("New gear: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        printType();
        int result = speed + increment;
        if (increment < 0) {
            System.out.println("Cannot increment negatively. Please use positive numbers to speed up a road bike.");
            return;
        } else if (result > 50) {
            System.out.println("Speed is too high. Highest possible increment: " + (50 - speed));
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
            System.out.println("Braking value cannot be negative. " +
                    "Please use positive numbers to brake a road bike.");
            return;
        } else if (result < 0) {
            System.out.println("Braking value for the road bike is too high. " +
                    "The highest possible is " + speed);
            return;
        }
        speed = result;
        printNewSpeed();
    }
}
