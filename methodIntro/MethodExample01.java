// Kasta tre tärningar, skriv ut vad varje tärning visar och
// visa vad totalen av alla tärningar blir

import java.util.Random;

public class MethodExample01 {
    public static void main(String[] args) {
        Random random = new Random();

        // Tärning 1
        int dice1 = random.nextInt(6) + 1;

        System.out.println("Tärning 1 visar: " + dice1);

        // Tärning 2
        int dice2 = random.nextInt(6) + 1;

        System.out.println("Tärning 2 visar: " + dice2);

        // Tärning 3
        int dice3 = random.nextInt(6) + 1;

        System.out.println("Tärning 3 visar: " + dice3);

        // Räkna ut total
        int total = dice1 + dice2 + dice3;

        System.out.println("Tärningarna visar totalt: " + total);
    }
}
