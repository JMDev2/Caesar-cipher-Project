package models;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        System.out.println("Your Ciphered word is:");
        System.out.println(CaesarEncoderDecorder.getEncryptMessage());
    }
}
