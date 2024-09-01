package com.betrybe.tech;

public class Application {
    public static void main(String[] args) {
    ComputerDevice genericDevice = new Laptop("Apple", 256.0, 13.3);

    if (genericDevice instanceof Laptop) {
        Laptop specificLaptop = (Laptop) genericDevice;
        }

    }
}
