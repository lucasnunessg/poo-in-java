package com.betrybe.tech;

public final class Desktop extends ComputerDevice {
    public Desktop(String brand, double storeCapacity) {
        super(brand);
    }

    @Override
    public void bootUp() {
        System.out.println("Iniciando o PC Desktop");
    }
}
