package com.codecool.theatre.performance;

import com.codecool.theatre.actor.Singer;

import java.time.LocalDateTime;

public class Opera<T extends Singer> extends Performance<T> {

    public Opera(String name, LocalDateTime dateTime, long ticketPrice, int MAX_GUEST_NUMBER) {
        super(name, dateTime, ticketPrice, MAX_GUEST_NUMBER);
    }

    @Override
    public void addActorToList(T singer) {
        listOfActors.add(singer);
    }

    @Override
    public String toString() {
        return "\nOpera{\n" +
                "listOfActors=" + listOfActors +
                "} \n" + super.toString();
    }
}
