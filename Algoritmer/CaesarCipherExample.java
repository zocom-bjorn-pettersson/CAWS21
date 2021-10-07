public class CaesarCipherExample {
    // This is a static variable that's available
    // in all methods in this class
    static char[] characters = {
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
            'J',
            'K',
            'L',
            'M',
            'N',
            'O',
            'P',
            'Q',
            'R',
            'S',
            'T',
            'U',
            'V',
            'W',
            'X',
            'Y',
            'Z',
            'Å',
            'Ä',
            'Ö',
            ' '
   };

    public static void main(String[] args) {
        // The message we want to run the cipher on
        String plaintext = "THIS IS A SECRET MESSAGE";

        // The ciphered message
        String caesarString = caesar(plaintext, 3);

        // The unciphered message
        String caesarStringDeciphered = caesar(caesarString, -3);

        System.out.println(plaintext);
        System.out.println(caesarString);
        System.out.println(caesarStringDeciphered);
    }
    
    public static String caesar(String message, int shuffle) {
        char[] messageCharArray = message.toCharArray();
        String returnMessage = "";
        
        for (int i = 0; i < messageCharArray.length; i++) {
            int characterIndex = indexInCharacterArray(messageCharArray[i]);
            int adjustedIndex = characterIndex + shuffle;

            if (adjustedIndex > characters.length - 1) {
                adjustedIndex -= characters.length;
            } else if (adjustedIndex < 0) {
                adjustedIndex += characters.length;
            }

            System.out.printf("%d -> %d\n", characterIndex, adjustedIndex);

            returnMessage += characters[adjustedIndex];
        }

        System.out.println();

        return returnMessage;
    }
    
    public static int indexInCharacterArray(char character) {
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == character) {
                index = i;
            }
        }

        return index;
    }
}
