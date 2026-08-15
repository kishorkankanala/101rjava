package com.inheritance;

class Engine {
    String type;
    String brakes;

    public Engine(String type, String brakes) {
        this.type = type;
        this.brakes = brakes;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + ", brakes=" + brakes + "]";
    }
}

class Car extends Engine {
    String color;
    String rpm;
    String speed;

    public Car(String type, String brakes, String color, String rpm, String speed) {
        super(type, brakes);
        this.color = color;
        this.rpm = rpm;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Car [color=" + color +  ", rpm=" + rpm + ", speed=" + speed + "]";
    }
}

public class Example3 {

    public static void main(String[] args) {

        Car c = new Car("Turbo", "Disc", "Yellow", "120", "30");

        System.out.println(c);
    }
}