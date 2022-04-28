package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class decryptedCharacterTest {
    @Test
    public void decryptedCharacter_returnsCharMinusThreePositions_QEB() {
        decryptedCharacter decryptedCharacter = new decryptedCharacter();
        String expected = "QE";
        assertEquals(expected, decryptedCharacter.decryptedCharacter("QEB", 3));

    }
}