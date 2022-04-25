package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class decryptedCharacterTest {
    @Test
    public void decryptedCharacter_returnsCharMinusThreePositions_F() {
        decryptedCharacter decryptedCharacter = new decryptedCharacter();
        String expected = "F";
        assertEquals(expected, decryptedCharacter.decryptedCharacter("F", 3));

    }
}