package Week9.Exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    private Caesar caesar = new Caesar();
    @Test
    void cipherAlphabetical() {

        String result=caesar.cipher("abz", 3);
        assertEquals("dec",result);
    }

    @Test
    void cipherNonAlphabetical() {
        String result=caesar.cipher("hello!", 1);
        assertEquals("ifmmp!",result);
    }

    @Test
    void cipherAlphabeticalUppercase() {
        String result=caesar.cipher("Hello", 1);
        assertEquals("Ifmmp",result);
    }
}