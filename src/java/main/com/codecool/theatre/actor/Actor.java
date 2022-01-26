package com.codecool.theatre.actor;

public abstract class Actor {

    String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract void perform();
}
