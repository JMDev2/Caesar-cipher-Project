package models;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String myText = scanner.nextLine();

        System.out.println("Please enter the key:");
        int myKey = scanner.nextInt();

        if (myKey > 0 && myKey <= 25){
            CaesarEncoderDecorder output = new CaesarEncoderDecorder(myText, myKey);
            encryptedCharacter enctypted = new encryptedCharacter();
            enctypted.encryptedCharacter(output.getText(), output.getKey());


            decryptedCharacter dectypted = new decryptedCharacter();
            dectypted.decryptedCharacter(output.getText(), output.getKey());

            System.out.println("Original text is:" + output.getText());
            System.out.println("The new text is:" + enctypted.getMyEncrypted());
        }
    }
}
