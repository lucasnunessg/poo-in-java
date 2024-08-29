package com.betrybe.electronics;

public class Application {
    public static void main(String[] args) {

        Television television = new Television("Philips", "LCD", 32);
        System.out.println("A televisão está ligada?");
        System.out.println(television.isOn());

        System.out.println("O volume atual é: ");
        System.out.println(television.getVolume());

        System.out.println("Modelo antigo:");
        System.out.println(television.getModel());
        double sizeCm = Television.convertToCentimeters(32);
        System.out.println("O tamanho da TV em cm é:" + sizeCm);

        television.setModel("LCD-Ultra");
        System.out.println("Modelo novo: ");
        System.out.println(television.getModel());

        System.out.println(television.info());
    }
}
