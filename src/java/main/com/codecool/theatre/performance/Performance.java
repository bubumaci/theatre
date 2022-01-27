package com.codecool.theatre.performance;

import com.codecool.theatre.actor.Actor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Performance<T extends Actor> {

    private final int MAX_GUEST_NUMBER;
    private final String name;
    private final LocalDateTime dateTime;
    private final long ticketPrice;
    protected List<T> listOfActors;
    private int numberOfSoldTickets;

    public Performance(String name, LocalDateTime dateTime, long ticketPrice, int MAX_GUEST_NUMBER) {
        this.MAX_GUEST_NUMBER = MAX_GUEST_NUMBER;
        this.name = name;
        this.dateTime = dateTime;
        this.ticketPrice = ticketPrice;
        listOfActors = new ArrayList<>();
        this.numberOfSoldTickets = 0;
    }

    public void addActorToList(T actor) {
        listOfActors.add(actor);
    }

    public boolean buyTicket() {
        if (numberOfSoldTickets < MAX_GUEST_NUMBER) {
            numberOfSoldTickets++;
            System.out.println("Ticket bought for " + name);
            return true;
        } else {
            System.out.println("Sold out. Cannot buy ticket for " + name);
            return false;
        }
    }

    public int getMAX_GUEST_NUMBER() {
        return MAX_GUEST_NUMBER;
    }

    public List<T> getListOfActors() {
        return listOfActors;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getNumberOfSoldTickets() {
        return numberOfSoldTickets;
    }

    public long getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return "Performance: " +
                "name='" + name +
                ", dateTime=" + dateTime +
                ", ticketPrice=" + ticketPrice +
                ", MAX_GUEST_NUMBER=" + MAX_GUEST_NUMBER +
                ", numberOfSoldTickets=" + numberOfSoldTickets +
                ", listOfActors=" + listOfActors;
    }
}
