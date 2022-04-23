package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarEncoderDecorderTest {
    @Test
    public void cipherCharacter_returnsCharPlusTwoPositions_C(){
        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        Character expected = 'C';
        assertEquals(expected, caesarEncoderDecorder.cipherCharacter('A'));
    }
    @Test
    public void cipherCharacter_returnsCharPlusTwoPositions_B(){
        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        Character expected = 'B';
        assertEquals(expected, caesarEncoderDecorder.cipherCharacter('Z'));
    }


}