package models;

import java.util.Arrays;

public class decryptedCharacter {
    private static  Integer key = 25;
    private static String decryptedMessage;

    Character[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Character decryptedCharacter(char letter){
        int position = Arrays.asList(ALPHABET).indexOf(letter);

        if(position + 3 >= ALPHABET.length){
            position = Math.abs(ALPHABET.length - position - 3);
        }else {
            position = position + 3;
        }
        return ALPHABET[position];
    }

}

