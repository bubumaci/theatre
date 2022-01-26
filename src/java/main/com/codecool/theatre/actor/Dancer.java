package com.codecool.theatre.actor;

public class Dancer extends Actor implements CanDance {
    public Dancer(String name) {
        super(name);
    }

    @Override
    public void dance() {
        System.out.println("party rock is in the house tonight " + name + " is having a good time");
    }

    @Override
    public void perform() {
        dance();
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                "} ";
    }
}
