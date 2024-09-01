package com.betrybe.tech;

public abstract class ComputerDevice {
    private final String brand;
    public static final double MAX_STORAGE_CAPACITY = 2048.0;

    public ComputerDevice(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public final void shutDown() {
        System.out.println("desligando o dispositivo...");
    }


    public abstract void bootUp();
}
