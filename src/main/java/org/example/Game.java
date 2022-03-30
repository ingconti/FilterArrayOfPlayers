package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players;

    public Game() {

        Player p1 = new Player(34, "Michael", Gender.MALE);
        Player p2 = new Player(17, "Jane", Gender.FEMALE);
        Player p3 = new Player(28, "John", Gender.MALE);
        Player p4 = new Player(47, "Peter", Gender.MALE);
        Player p5 = new Player(27, "Lucy", Gender.FEMALE);

        this.players = List.of(p1, p2, p3, p4, p5);

    }

    ArrayList<Player> filteredPlayerBy(int age) {

        ArrayList<Player> result = new ArrayList<>();

        for (Player p : this.players) {

            if (p.getAge() >= age) {

                result.add(p);
            }
        }
        return result;
    }
}
