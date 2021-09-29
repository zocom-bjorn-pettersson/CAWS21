// Kasta tre tärningar, skriv ut vad varje tärning visar och
// visa vad totalen av alla tärningar blir
// I detta exempel har vi flyttat tärningskastandet till en egen metod

import java.util.Random;

public class MethodExample02 {
    public static void main(String[] args) {
        // Tärning 1
        int dice1 = throwDice();

        System.out.println("Tärning 1 visar: " + dice1);

        // Tärning 2
        int dice2 = throwDice();

        System.out.println("Tärning 2 visar: " + dice2);

        // Tärning 3
        int dice3 = throwDice();

        System.out.println("Tärning 3 visar: " + dice3);

        // Räkna ut total
        int total = dice1 + dice2 + dice3;

        System.out.println("Tärningarna visar totalt: " + total);
    }

    // Vår nya metod.
    // * "public static" använder vi just nu på alla nya metoder
    // * "int" är vad metoden skickar tillbaka
    // * "throwDice()" är namnet på vår metod
    // * Inom paranteserna i "throwDice()" kan vi ange "argument" (se nästa exempel)
    public static int throwDice() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        return dice;
    }
}
