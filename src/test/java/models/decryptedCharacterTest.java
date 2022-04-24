package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class decryptedCharacterTest {
//    @Test
//    public void decryptedCharacterText_returnsCharPlusThreePositions_F() {
//        decryptedCharacter decryptedCharacter = new decryptedCharacter();
//        Character expected = 'I';
//        assertEquals(expected, decryptedCharacter.decryptedCharacterText('F'));
//
//    }
//    @Test
//    public void decryptedCharacterText_returnsCharPlusThreePositions_K() {
//        decryptedCharacter decryptedCharacter = new decryptedCharacter();
//        Character expected = 'N';
//        assertEquals(expected, decryptedCharacter.decryptedCharacterText('K'));
//
//    }

    @Test
    public void decryptedCharacterText_returnsCharPlusThreePositions_BOY() {
        decryptedCharacter decryptedCharacter = new decryptedCharacter();
        String expected = "ERB";
        assertEquals(expected, decryptedCharacter.decryptedText("BOY"));

    }
}
