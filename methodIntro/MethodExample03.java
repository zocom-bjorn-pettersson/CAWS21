// Kasta tre tärningar, skriv ut vad varje tärning visar och
// visa vad totalen av alla tärningar blir
// I detta exempel har vi ändrat hur vi bygger upp meddelandet som skrivs ut

import java.util.Random;

public class MethodExample03 {
    public static void main(String[] args) {
        // Tärning 1
        int dice1 = throwDice();

        // Här skapar vi en vi en ny String som heter dice1Message
        // som får sitt värde från metoden getDiceMessage
        // Det första argumentet är vilket tärningsnummer det är,
        // och det andra argumentet är vad tärningen visar
        String dice1Message = getDiceMessage(1, dice1);
        System.out.println(dice1Message);

        // Tärning 2
        int dice2 = throwDice();
        String dice2Message = getDiceMessage(2, dice2);
        System.out.println(dice2Message);

        // Tärning 3
        int dice3 = throwDice();
        String dice3Message = getDiceMessage(3, dice3);
        System.out.println(dice3Message);

        // Räkna ut total
        int total = dice1 + dice2 + dice3;

        System.out.println("Tärningarna visar totalt: " + total);
    }

    // Vår första metod.
    // * "public static" använder vi just nu på alla nya metoder
    // * "int" är vad metoden skickar tillbaka
    // * "throwDice()" är namnet på vår metod
    // * Inom paranteserna i "throwDice()" kan vi ange "argument" (se nästa exempel)
    public static int throwDice() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        return dice;
    }

    // Vår andra metod
    // Här har vi en ny metod som tar två argument och retunerar en String
    public static String getDiceMessage(int diceNumber, int diceValue) {
        String myMessage = "Tärning " + diceNumber + " visar: " + diceValue;
        return myMessage;
    }
}
