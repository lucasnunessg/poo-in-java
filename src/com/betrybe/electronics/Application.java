package com.betrybe.electronics;

public class Application {
    public static void main(String[] args) {

        Television television = new Television("Philips", "LCD", 32);
        television.turnOn();
        television.turnOff();


        System.out.println(television.info());
    }
}
