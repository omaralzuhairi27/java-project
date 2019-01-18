package Week9.robodog;

import java.util.List;
import java.util.stream.Collectors;

public class Summarizer {

    private FileReader reader = new FileReader();

    public List<String> findUniqueTricks(String filePath) {
        return reader.asStream(filePath)
                .map(line -> line.replaceAll("!", ""))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
