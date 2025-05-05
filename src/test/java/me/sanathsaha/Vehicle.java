package me.sanathsaha;

import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


