// Kasta tre tärningar, skriv ut vad varje tärning visar och
// visa vad totalen av alla tärningar blir
// I detta exempel har vi ändrat hur vi räknar ut totalen

import java.util.Random;

public class MethodExample04 {
    public static void main(String[] args) {
        // Tärning 1
        int dice1 = throwDice();
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
        // Här skapar vi en Array med alla våra tärningskast
        // och matar in den som första argument till countTotal()
        int[] diceValues = {dice1, dice2, dice3};
        int total = countTotal(diceValues);

        System.out.println("Tärningarna visar totalt: " + total);
    }

    // Vår första metod
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
    
    // Här är en metod som tar emot en lista av integers och räknar ihop totalen
    // Listan vi matar in kan vara nästan hur många tal som helst, och är därför flexibel
    public static int countTotal(int[] numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }
}
