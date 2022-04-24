package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class decryptedCharacterTest {
    @Test
    public void decryptedCharacterText_returnsCharPlusThreePositions_F() {
        decryptedCharacter decryptedCharacter = new decryptedCharacter();
        Character expected = 'I';
        assertEquals(expected, decryptedCharacter.decryptedCharacterText('F'));

    }
}