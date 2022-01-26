package com.codecool.theatre.performance;

import com.codecool.theatre.actor.Dancer;

import java.time.LocalDateTime;

public class Ballet<T extends Dancer> extends Performance<T> {

    public Ballet(String name, LocalDateTime dateTime, long ticketPrice, int MAX_GUEST_NUMBER) {
        super(name, dateTime, ticketPrice, MAX_GUEST_NUMBER);
    }

    @Override
    public void addActorToList(T dancer) {
        listOfActors.add(dancer);
    }

    @Override
    public String toString() {
        return "\nBallet{\n" +
                "listOfActors=" + listOfActors +
                "} \n" + super.toString();
    }
}
