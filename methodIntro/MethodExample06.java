// Kasta tre tärningar, skriv ut vad varje tärning visar och
// visa vad totalen av alla tärningar blir
// Det här är exakt samma kod som innan, vi har bara flyttat
// runt rader för läsbarhetens skull
// Kommentarerna har även ändrats till att beskriva syftet med koden

import java.util.Random;

public class MethodExample06 {
    public static void main(String[] args) {
        // Kasta tärningar
        int dice1 = throwDice();
        int dice2 = throwDice();
        int dice3 = throwDice();

        // Hämta meddelanden
        String dice1Message = getDiceMessage(1, dice1);
        String dice2Message = getDiceMessage(2, dice2);
        String dice3Message = getDiceMessage(3, dice3);

        // Skriv ut meddelanden
        System.out.println(dice1Message);
        System.out.println(dice2Message);
        System.out.println(dice3Message);

        // Räkna ut total
        int[] diceValues = {dice1, dice2, dice3};
        int total = countTotal(diceValues);

        // Skriv ut total
        System.out.println("Tärningarna visar totalt: " + total);

        // Hälsa adjö
        goodByeMessage("Elvis");
    }

    // Skicka tillbaka ett slumpat tal mellan 1 och 6
    public static int throwDice() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        return dice;
    }

    // Bygg upp och retunera en sträng med vårt tärningskast
    public static String getDiceMessage(int diceNumber, int diceValue) {
        String myMessage = "Tärning " + diceNumber + " visar: " + diceValue;
        return myMessage;
    }

    // Räkna ut totalen av array av integers
    public static int countTotal(int[] numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }

    // Hälsa användaren adjö
    public static void goodByeMessage(String name) {
        System.out.println("Hej då, " + name + "!");
    }
}
