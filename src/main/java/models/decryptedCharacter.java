package models;

import java.util.Arrays;

public class decryptedCharacter {
    private String mALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private StringBuilder mydecrypted = new StringBuilder("");
    private int key;
    private  char decryptedCharacter;
    private char[] initialArray;
    private int currentIndex;
    private int newIndex;
    private String mOriginalText;


    public String decryptedCharacter (String text, int key){
        this.mOriginalText = text.toUpperCase();
        this.key= key;
        this.initialArray = mOriginalText.toCharArray();

        for (int i = 0; i<initialArray.length; i++){
            currentIndex = mALPHABETS.indexOf(initialArray[i]);
            if (currentIndex != -1){
                newIndex = (currentIndex + key) % 26;
                if (newIndex > 26){
                    newIndex -= 26;
                    decryptedCharacter = mALPHABETS.charAt(newIndex);
                    mydecrypted.append(decryptedCharacter);
                }
                else {
                    decryptedCharacter = mALPHABETS.charAt(newIndex);
                    mydecrypted.append(decryptedCharacter);
                }
            }


        }
        return mydecrypted.toString();
    }

    public String getMyEncrypted() {
        return mydecrypted.toString();
    }

}

