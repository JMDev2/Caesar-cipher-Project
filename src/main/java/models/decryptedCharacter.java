package models;

import java.util.Arrays;

public class decryptedCharacter {
    private static  Integer key = 25;
    private static String decryptedMessage;

    Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Character decryptedCharacterText(char letter){
        int position = Arrays.asList(ALPHABET).indexOf(letter);

        if(position + 3 >= ALPHABET.length){
            position = Math.abs(ALPHABET.length - position - 3);
        }else {
            position = position + 3;
        }
        return ALPHABET[position];
    }

    public String decryptedText (String text){
        char[] decryptedTextArray = text.toUpperCase().toCharArray();
        String decryptedText = "";


        for (int i=0; i<decryptedTextArray.length; i++){
            decryptedText+=decryptedCharacterText(decryptedTextArray[i]);
        }
        return decryptedText;

    }

    public static Integer getKey() {
        return key;
    }

    public static void setKey(Integer key) {
        decryptedCharacter.key = key;
    }

    public static String getDecryptedMessage() {
        return decryptedMessage;
    }

    public static void setDecryptedMessage(String decryptedMessage) {
        decryptedCharacter.decryptedMessage = decryptedMessage;
    }
}

