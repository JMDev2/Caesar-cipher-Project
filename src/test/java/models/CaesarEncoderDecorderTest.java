package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaesarEncoderDecorderTest {
    @Test
    public void cipherCharacter_returnsCharPlusTwoPositions_F(){
        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        Character expected = 'C';
        assertEquals(expected, caesarEncoderDecorder.cipherCharacter('F'));
    }
    @Test
    public void cipherCharacter_returnsCharPlusTwoPositions_D(){
        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        Character expected = 'A';
        assertEquals(expected, caesarEncoderDecorder.cipherCharacter('D'));
    }
    @Test
    public void cipherCharacter_returnsCharPlusTwoPositions_THE(){
        CaesarEncoderDecorder caesarEncoderDecorder = new CaesarEncoderDecorder();
        String expected = "QEB";
        assertEquals(expected, caesarEncoderDecorder.cipherText("THE"));
    }


}