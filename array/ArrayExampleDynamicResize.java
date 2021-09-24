/*
   I det här exemplet utökar vi en array genom att skapa en tillfällig ("temporary") array 
   som är ett steg större än den nuvarande, och lägger till den nya filmen sist i den
   tillfälliga arrayen. Sen ersätter vi den nuvarande arrayen (favoriteMovies) med den tillfälliga arrayen.

   Filmerna kommer sparas i en array
   Skapa en meny där användaren får välja mellan lite olika val:
     * Användaren ska kunna lägga in nya filmer i arrayen
     * Användaren ska kunna skriva ut alla filmer i arrayen
     * Användaren ska kunna avsluta programmet
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleDynamicResize {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        boolean programRunning = true;

        String[] favoriteMovies = new String[4];
        favoriteMovies[0] = "Men In Black";
        favoriteMovies[1] = "Enemy of the State";
        favoriteMovies[2] = "I, Robot";
        favoriteMovies[3] = "Wild Wild West";

        // "println" betyder "print line"
        // "line" betyder att raden avslutas med "\n" ("ett escape:at n")
        //System.out.print("Hej\nHej\n\n\n\n\nHej\n");
        //System.out.println("Hej");
        //System.out.print("Hej\n");

        while (programRunning) {
            System.out.println("Meny");
            System.out.println("1) Lägg in ny film");
            System.out.println("2) Lista alla filmer");
            System.out.println("3) Avsluta programmet");
            System.out.print("> ");

            int menuChoice = 0;
            boolean menuChoiceAddMovie = false;
            boolean menuChoiceListMovies = false;
            boolean menuChoiceQuitProgram = false;

            try {
                menuChoice = Integer.parseInt(keyboardInput.nextLine());
            } catch (Exception e) {
                System.out.println("Ett fel har inträffat.");
            }

            if (menuChoice != 0) {
                System.out.println("Du har valt: " + menuChoice);
            }

            switch (menuChoice) {
                case 1: // Lägg in ny film
                    menuChoiceAddMovie = true;
                    break;
                case 2: // Lista alla filmer
                    menuChoiceListMovies = true;
                    break;
                case 3: // Avsluta program
                    System.out.println("Avsluta program");
                    menuChoiceQuitProgram = true;
                    break;
                default:
                    System.out.println("Felaktigt menyval.");
            }

            if (menuChoiceAddMovie) {
                System.out.println("Vilken film vill du lägga till?");
                System.out.print("> ");
                String newMovieTitle = keyboardInput.nextLine();
                System.out.println("Du skrev in " + newMovieTitle);

                String[] temporaryFavoriteMovies = Arrays.copyOf(favoriteMovies, favoriteMovies.length + 1);

                temporaryFavoriteMovies[favoriteMovies.length] = newMovieTitle;

                favoriteMovies = temporaryFavoriteMovies;
            } else if (menuChoiceListMovies) {
                System.out.println("Alla filmer:");

                for (int index = 0; index < favoriteMovies.length; index++) {
                    System.out.println("* " + favoriteMovies[index]);
                }
            }
        }

        // while ()
        // variabel för att styra while-loopen, så den avslutar när
        //   användaren vill avsluta programmet
        // Skapa en array med mina favoritfilmer
        /*


        System.out.println(favoriteMovies[0]);
         */
    }
}
