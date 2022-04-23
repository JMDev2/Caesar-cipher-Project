package models;

import java.util.Arrays;

public class CaesarEncoderDecorder {
    private static int key = 25;
    private static String encryptMessage;
    private static String dencryptMessage;

    Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Character cipherCharacter(char letter) {
        int position = Arrays.asList(ALPHABET).indexOf(letter);

        if (position + 2 >= ALPHABET.length) {
            position = Math.abs(ALPHABET.length - position - 2);
        } else {
            position = position + 2;

        }
        return ALPHABET[position];
    }

    public String cipherText(String text){
        char[] wordtextArray = text.toUpperCase().toCharArray();
        String cipherText = "";

        for (int i=0; i<wordtextArray.length; i++){
            cipherText+=cipherCharacter(wordtextArray[i]);
        }
        return cipherText;
    }

    public static int getKey() {
        return key;
    }

    public static String getEncryptMessage() {
        return encryptMessage;
    }

    public static String getDencryptMessage() {
        return dencryptMessage;
    }
}










