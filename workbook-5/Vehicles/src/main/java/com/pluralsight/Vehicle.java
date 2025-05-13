package com.pluralsight;

public class Vehicle {

    protected String model;
    protected String color;
    protected int topSpeed;
    protected int fuelCapacity;
    protected int numberOfPassengers;
    protected int cargoCapacity;

    public Vehicle(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity) {
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.fuelCapacity = fuelCapacity;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void startEngine() {

        System.out.println("Engine Started!");

    }

    public void stopEngine() {

        System.out.println("Engine Stopped!");

    }

    public void accelerate() {

        System.out.println("Accelerate!");

    }

    public void brake() {

        System.out.println("Brake!");

    }

}
