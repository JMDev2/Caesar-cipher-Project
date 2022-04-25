package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class encryptedCharacterTest {
    @Test
    public void encryptedCharacter_returnsCharMinusThreePositions_THE() {
        encryptedCharacter encryptedCharacter = new encryptedCharacter();
        String expected = "QEB";
        assertEquals(expected, encryptedCharacter.encryptedCharacter("THE", 3));

    }
}
