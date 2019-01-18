package Week9.robodog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SummarizerTest {

    private Summarizer summarizer = new Summarizer();

    @Test
    void findUniqueTricks() {
        String filePath = "lecture/stream/robodog/robodog.txt";
        List<String> tricks = summarizer.findUniqueTricks(filePath);

        List<String> expected = Arrays.asList("bark, move left, move right, step backwards, step forward".split(", "));
        Assertions.assertEquals(expected, tricks);
    }
}