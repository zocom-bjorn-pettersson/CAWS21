import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        // Vi kan se variabler som lådor.
        // Den här lådan har etiketten "coins", och i lådan hittar vi en 2:a
        int coins = 2;

        System.out.println("I have " + coins + " coins.");
        System.out.println("I still have " + coins + " coins.");

        // 20, 50 och 100 är olika element i arrayen values
        // 20 har index 0
        // 50 har index 1
        // 100 har index 2
        // Den här arrayen har en "längd av 3"
        // Längden är hur många element som finns i arrayen
        // En array har ett förbestämt antal "fack"
        int[] values = {20, 50, 100};

        // En byrå med flera fack (or a filing cabinet)
        String[] favoriteMovies = new String[5];
        favoriteMovies[0] = "Arrival";
        favoriteMovies[1] = "Men In Black";
        favoriteMovies[2] = "Independence day";
        favoriteMovies[3] = "Fifth Element";

        Scanner keyboardInput = new Scanner(System.in);

        // Fråga användaren om dens favoritfilmer
        for (int i = 0; i < favoriteMovies.length; i++) {
            System.out.println("Vilken är din favoritfilm? Nummer " + i);
            System.out.print("> ");
            String newFavorite = keyboardInput.nextLine();
            System.out.println("Användaren skrev: " + newFavorite);
            favoriteMovies[i] = newFavorite;
        }

        /*
        System.out.println("Favoritfilm 1: " + favoriteMovies[0] + "!");
        System.out.println("Favoritfilm 2: " + favoriteMovies[1] + "!");
        System.out.println("Favoritfilm 3: " + favoriteMovies[2] + "!");
        */

        // Skriv ut favoritfilmerna
        for (int i = 0; i < favoriteMovies.length; i++) {
            if (favoriteMovies[i] != null) {
                System.out.println("Favoritfilm " + i + ": " + favoriteMovies[i]);
            }
        }

    }
}
