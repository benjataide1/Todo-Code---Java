package Exercise_Games.test;

import Exercise_Games.logic.VideoGames;

import java.util.*;

public class TestVideoGame {
    public static void main(String[] args) {
        List<VideoGames> games = new ArrayList<>();

        VideoGames videoGames = new VideoGames(123, "Battlefield", "PS5", 125, "Oro");

        games.add(videoGames);
        games.add(new VideoGames(473, "Mario Bros", "Nintendo", 4, "Plata"));
        games.add(new VideoGames(577, "Fornite", "PC", 100, "Leyenda"));
        games.add(new VideoGames(211, "LOL", "PC", 25, "Oro"));
        games.add(new VideoGames(433, "Call of Duty", "PS3", 80, "Bronce"));



        // Recorro mi List
        games.forEach((VideoGames e) -> {
            System.out.println("Title: " + e.getTitle() + ", Console: " + e.getConsole() + ", AmountPlayers: " + e.getAmountPlayers());
        });


        // Cambio los atributos de uno de mis objetos
        games.get(3).setTitle("Uncharted - 4");
        games.get(3).setAmountPlayers(1);


        System.out.println("-".repeat(15));


        //Obtengo solo el Juego que se juege en PC
        games.forEach((VideoGames e) -> {
            if (e.getConsole().equalsIgnoreCase("pc")) {
                System.out.println(e.getTitle());
            }

        });


    }
}
