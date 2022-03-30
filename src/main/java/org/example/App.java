package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();

        ArrayList<Player> filtered = game.filteredPlayerBy(22);

        System.out.println(filtered);

    }

}
