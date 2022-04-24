package models;

public class CaesarEncoderDecorder {
    private String text;
    private int key;

    public CaesarEncoderDecorder(String text, int key) {
        this.text = text;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }
}











