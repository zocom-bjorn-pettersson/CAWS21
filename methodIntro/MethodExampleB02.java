// Example of calling methods from other methods
// Using ArrayList
// Using class variables

import java.util.ArrayList;
import java.util.Random;

public class MethodExampleB02 {
    static ArrayList<Integer> myMultipleDice = new ArrayList<Integer>();
    static Random myRandom = new Random();

    public static void main(String[] args) {
        System.out.println("Kasta flera tärningar:");
        throwMultipleDice(5);

        for(int i = 0; i < myMultipleDice.size(); i++) {
            System.out.printf("Tärningen visar: %d\n", myMultipleDice.get(i));
        }
    }

    public static void throwMultipleDice(int numberOfDice) {
        for (int i = 0; i < numberOfDice; i++) {
            System.out.println("Kastar tärning.");
            myMultipleDice.add(throwDice());
        }
    }

    public static int throwDice() {
        int randomNumber = myRandom.nextInt(6) + 1;

        return randomNumber;

        //De två raderna ovanför kan skrivas som en rad:
        //  return myRandom.nextInt(6) + 1;
    }
}
