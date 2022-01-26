package com.codecool.theatre;

import com.codecool.theatre.actor.Actor;
import com.codecool.theatre.performance.Performance;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    List<Performance<? extends Actor>> performanceList;
    Long currentProfit;

    public Theatre() {
        this.performanceList = new ArrayList<>();
        this.currentProfit = 0L;
    }

    public void addNewPerformance(Performance<? extends Actor> performance) {
        performanceList.add(performance);
    }

    public void buyNewTicketForPerformance(Performance<? extends Actor> performance) {
        if (performance.buyTicket()) currentProfit += performance.getTicketPrice();
    }

    public List<Performance<? extends Actor>> getPerformanceList() {
        return performanceList;
    }

    public Long getCurrentProfit() {
        return currentProfit;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "\nperformanceList=" + performanceList +
                ", \ncurrentProfit=" + currentProfit +
                '}';
    }
}
