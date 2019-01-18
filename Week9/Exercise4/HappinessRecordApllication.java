package Week9.Exercise4;

import Week9.Exercise2.Streams;
import Week9.robodog.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessRecordApllication {
    private FileReader fileReader = new FileReader();

    public List <HappinessRecord> getCountrys(String filePath) {
        return fileReader.asStream(filePath)
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> toHappinessRecord(e))
                .collect(Collectors.toList());

    }

    private HappinessRecord toHappinessRecord(String[] columns) {
        String country = columns[0];
        String rank = columns[1];
        String score = columns[2];
        return new HappinessRecord(country, Integer.valueOf(rank), new Double(score));
    }

    public static void main(String[] args) {
        HappinessRecordApllication apllication = new HappinessRecordApllication();
        List <HappinessRecord> fiveCountry = apllication.getCountrys("Week9/Exercise4/world-happiness-2017.csv");
        fiveCountry.stream()
                .sorted((e1, e2) -> e1.getRank().compareTo(e2.getRank()))
                .limit(5)
                .forEach(e -> System.out.println(e));

    }
}
