package com.betrybe.tech;

public class Laptop extends ComputerDevice implements Chargeable {
    private double size;

    public Laptop(String brand, double storageCapacity, double size) {
        super(brand);

        this.size = size;
    }
    @Override
    public void charge() {
        System.out.println("Carregando o laptop");
    }

    @Override
    public int getBatteryLevel() {
        return 82;
    }
    @Override
    public void bootUp() {
        System.out.println("Iniciando o laptop de tamanho " + size + " capacidade de armazenamento de " + " gb" + "...");
    }
}
