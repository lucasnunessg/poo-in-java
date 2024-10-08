package com.betrybe.electronics;

public class Television {
    private static int MAX_VOLUME = 30;
    private static double INCH_TO_CM = 2.54;
    private int volume = 0;

    private boolean isOn = false;

    private String brand;
    private String model;
    private int size;

    public Television(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    public static double convertToCentimeters(double inches) {
        return inches * INCH_TO_CM;
    }
    public int getVolume() {
        return volume;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("Ligando televisão...");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Desligando televisão...");
        isOn = false;
    }

    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public String info() {
        return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
                brand, model, size, isOn
        );
    }
}