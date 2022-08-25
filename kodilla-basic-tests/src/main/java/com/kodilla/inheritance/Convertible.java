package com.kodilla.inheritance;

import com.kodilla.inheritance.Car;

public class Convertible extends Car {

    public Convertible(int wheels, int seats) {
        super(wheels, seats);

    }
    public void openRoof() {
        System.out.println("Opening roof...");
    }
    public void closingRoof() {
        System.out.println("Closing roof...");
    }
    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

}