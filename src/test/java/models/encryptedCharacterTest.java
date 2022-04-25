package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class encryptedCharacterTest {
    @Test
    public void encryptedCharacter_returnsCharMinusThreePositions_F() {
        encryptedCharacter encryptedCharacter = new encryptedCharacter();
        String expected = "C";
        assertEquals(expected, encryptedCharacter.encryptedCharacter("F", 3));

    }
}
