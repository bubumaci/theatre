package com.codecool.theatre.actor;

public class Singer extends Actor implements CanSing {
    public Singer(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("so i said thank you for the music, for giving it to " + name);
    }

    @Override
    public void perform() {
        sing();
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                "} ";
    }
}
