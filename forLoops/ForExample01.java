import java.util.Random;

public class ForExample01 {
    public static void main(String[] argv) {
        int numberOfDice = 5;
        Random random = new Random();

        // For (Startvärde; villkor; förändring;)
        for (int i = 0; i < numberOfDice; i++) {
            int diceValue = random.nextInt(6) + 1;
            System.out.println("Tärning " + i + " landade på: " + diceValue);
        }
    }
}
