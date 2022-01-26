package com.codecool;

import com.codecool.theatre.Theatre;
import com.codecool.theatre.actor.Actor;
import com.codecool.theatre.actor.Dancer;
import com.codecool.theatre.actor.Singer;
import com.codecool.theatre.performance.Ballet;
import com.codecool.theatre.performance.Opera;
import com.codecool.theatre.performance.Performance;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Opera<Singer> opera = createOpera(theatre);
        Ballet<Dancer> ballet = createBallet(theatre);
        System.out.println(theatre);

        simulateTicketSelling(theatre, opera, ballet);

        for (Performance<? extends Actor> performance : theatre.getPerformanceList()) {
            for (Actor actor : performance.getListOfActors()) {
                actor.perform();
            }
        }
        System.out.println("Current Profit: " + theatre.getCurrentProfit());
    }

    private static Ballet<Dancer> createBallet(Theatre theatre) {
        Ballet<Dancer> ballet = new Ballet<>("Diótörő", LocalDateTime.now(), 6600L, 200);
        ballet.addActorToList(new Dancer("Anna"));
        theatre.addNewPerformance(ballet);
        return ballet;
    }

    private static Opera<Singer> createOpera(Theatre theatre) {
        Opera<Singer> opera = new Opera<>("Varázsfuvola", LocalDateTime.now(), 5900L, 130);
        opera.addActorToList(new Singer("Mirabel"));
        theatre.addNewPerformance(opera);
        return opera;
    }

    private static void simulateTicketSelling(Theatre theatre, Opera<Singer> opera, Ballet<Dancer> ballet) {
        Random random = new Random();
        final int BOUND = 200;
        for (int i = 0; i < random.nextInt(BOUND); i++) {
            if (random.nextBoolean()) {
                theatre.buyNewTicketForPerformance(opera);
            } else {
                theatre.buyNewTicketForPerformance(ballet);
            }
        }
    }
}
