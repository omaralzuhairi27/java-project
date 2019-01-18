package Week9.Solutions.ex2;

import Week9.robodog.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    private FileReader reader = new FileReader();
    private List<String> names = reader.asList("exercise/week9/source/names.txt");

    @Test
    void testStreams() {
        List<String> shortNames = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, shortNames);

        List<String> endWithM = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, endWithM);

        List<String> containEandF = names.stream()
                .filter(e -> e.contains("e"))
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());
        expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, containEandF);

        List<String> shortAndDoubleA = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a"))
                .filter(e -> e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, shortAndDoubleA);
    }

}
