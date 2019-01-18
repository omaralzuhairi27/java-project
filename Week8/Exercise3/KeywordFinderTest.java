package Week8.Exercise3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {
    KeywordFinder keywordFinder = new KeywordFinder();

    @Test
    void getElegantCondation() {
        String elegantWord = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> result=keywordFinder.getElegantCondation(elegantWord);
        List<String> expected = Arrays.asList("elephant","eleven","electricity","elevator");
        assertEquals(expected,result);

    }

    @Test
    void getPlayfulCondation() {
        String playful = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> result=keywordFinder.getPlayfulCondation(playful);
        List<String> expected = Arrays.asList("rightful","powerful","awful","colorful");
        assertEquals(expected,result);
    }
}