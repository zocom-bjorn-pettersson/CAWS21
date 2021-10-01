// Example of calling methods from other methods

import java.util.Random;

public class MethodExampleB01 {
    public static void main(String[] args) {
        int myDice = throwDice();
        int myDice2 = throwDice();

        System.out.printf("Tärningarna visar: %d, %d\n", myDice, myDice2);

        System.out.println("Kasta flera tärningar:");
        int[] myMultipleDice = throwMultipleDice(5);

        for(int i = 0; i < myMultipleDice.length; i++) {
            System.out.printf("Tärningen visar: %d\n", myMultipleDice[i]);
        }

    }

    public static int[] throwMultipleDice(int numberOfDice) {
        int[] multipleDice = new int[numberOfDice];

        for (int i = 0; i < numberOfDice; i++) {
            System.out.println("Kastar tärning.");
            multipleDice[i] = throwDice();
        }

        return multipleDice;
    }

    public static int throwDice() {
        Random myRandom = new Random();

        int randomNumber = myRandom.nextInt(6) + 1;

        return randomNumber;

        //return myRandom.nextInt(6) + 1;
    }
}
