public class BubbleSortExample {
    public static void main(String[] args) {
        // An array of unsorted integers
	      int[] unsortedArray = {7,8,6,9,4,3};

	      // Print the array
	      printArray(unsortedArray);

	      // Sort the array
	      int[] sortedArray = bubbleSort(unsortedArray);

	      // Print the sorted array
        System.out.println("--------------------------");
        System.out.println("Our array has been sorted:");
        printArray(sortedArray);
    }
    
    public static int[] bubbleSort(int[] myArray) {
        int tmp = 0;

        /* This is a sorting algorithm called BubbleSort
           It's pretty slow, but it's a good example of a simpler sorting algorithm

           The pseudocode looks like this:
             for i from 0 to N
               for j from 0 to N - 1 - i
                 if a[j] > a[j+1]
                   swap(a[j], a[j+1])
                   
           (Note: "N" is the length of the array, N stands for "number")

           It's called "bubble sort" because the highest number will "bubble"
             to the right on every iteration (step of the loop)

           We do for "j from 0 to N - 1 - i" because we can skip the ones we've already sorted
           (the highest numbers that have moved to the right)
         */

        for (int i = 0; i < myArray.length; i++) {
            System.out.println();
            System.out.println("=====================");
            System.out.printf("Comparing from 0 to %d (%d elements)\n", myArray.length - 1 - i, myArray.length - i);
            for (int j = 0; j < myArray.length - 1 - i; j++) {

                System.out.printf("Comparing %d and %d\n",  myArray[j], myArray[j+1]);

                if (myArray[j] > myArray[j+1]) {
                    System.out.printf("- Swap %d and %d\n", myArray[j], myArray[j+1]);

                    tmp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = tmp;

                    System.out.println();
                    System.out.println("Current sorting:");

                    printArray(myArray);
                } else {
                    System.out.printf("- %d and %d are in order\n", myArray[j], myArray[j+1]);
                }

                System.out.println();
                //System.out.println("Inner loop end");
            }

            System.out.println("Outer loop end");
        }

        // The array has been sorted
        // Return the sorted array
        return myArray;
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("* " + array[i]);
        }
    }
}
