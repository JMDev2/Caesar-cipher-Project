package models;

public class encryptedCharacter {
    private String mALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private StringBuilder myEncrypted = new StringBuilder("");
    private int key;
    private  char encryptedCharacter;
    private char[] initialArray;
    private int currentIndex;
    private int newIndex;
    private String mOriginalText;


    public String encryptedCharacter (String text, int key){
        this.mOriginalText = text.toUpperCase();
        this.key= key;
        this.initialArray = mOriginalText.toCharArray();

        for (int i = 0; i<initialArray.length; i++){
            currentIndex = mALPHABETS.indexOf(initialArray[i]);
            if (currentIndex != -1){
                newIndex = (currentIndex - key) % 26;
                if (newIndex < 0){
                    newIndex += 26;
                    encryptedCharacter = mALPHABETS.charAt(newIndex);
                    myEncrypted.append(encryptedCharacter);
                }
                else {
                    encryptedCharacter = mALPHABETS.charAt(newIndex);
                    myEncrypted.append(encryptedCharacter);
                }
            }


        }
        return myEncrypted.toString();
    }

    public String getMyEncrypted() {
        return myEncrypted.toString();
    }
}
