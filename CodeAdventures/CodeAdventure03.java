import java.util.Random;

// Demonstrerat i video 2021-10-06
public class CodeAdventure03 {

    public static void main(String[] args) {
        int dice = throwDie();
        System.out.println("dice: " + dice);

        int[] multipleDice = throwMultipleDice(5);

        for (int i = 0; i < multipleDice.length; i++) {
            //System.out.printf("multipleDice[%d]: %d\n", i, multipleDice[i]);
            System.out.println("multipleDice[" + i + "]: " + multipleDice[i]);
        }

        int[] diceValueToNumber = new int[6];
        // 0 -> antalet ettor
        // 1 -> antalet tvår
        // 2 - > antalet treor
        // ... osv

        int search = 1;
        for (int i = 0; i < diceValueToNumber.length; i++) {
            diceValueToNumber[i] = numberOfValue(multipleDice, search);
            System.out.println("Antalet som visar " + search + ":" + diceValueToNumber[i]);
            search++;
        }

        /*
        int numberOfOnes = numberOfValue(multipleDice, 1);
        int numberOfTwos = numberOfValue(multipleDice, 2);
        int numberOfThrees = numberOfValue(multipleDice, 3);

        System.out.println("Number of 1: " + numberOfOnes);
        System.out.println("Number of 2: " + numberOfTwos);
        System.out.println("Number of 3: " + numberOfThrees);
         */

    }

    public static int throwDie() {
        Random myRandom = new Random();
        int diceValue = myRandom.nextInt(6) + 1;

        return diceValue;
    }

    public static int[] throwMultipleDice(int numberOfDiceToThrow) {
        int[] myDice = new int[numberOfDiceToThrow];
        //System.out.println("Argument numberOfDiceToThrow: " + numberOfDiceToThrow);

        for (int i = 0; i < myDice.length; i++) {
            myDice[i] = throwDie();
        }

        return myDice;
    }

    public static int numberOfValue(int[] myArray, int searchFor) {
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            // om searchFor är samma som elementet i arrayen
            // räkna uppåt
            if (myArray[i] == searchFor) {
                counter++;
            }
        }

        return counter;
    }

}