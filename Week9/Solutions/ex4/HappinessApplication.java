package Week9.Solutions.ex4;

import exercise.week9.reader.FileReader;

import java.util.Comparator;

public class HappinessApplication {

    public static void main(String[] args) {
        new FileReader().asStream("exercise/week9/source/world-happiness-2017.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new HappinessRecord(columns[0], Integer.valueOf(columns[1]), Double.valueOf(columns[2])))
                .sorted(Comparator.comparing(e -> e.getRank()))
                .limit(5)
                .map(e -> "Rank: " + e.getRank() + " | Country: " + e.getCountry() + " | Score: " + e.getScore())
                .forEach(e -> System.out.println(e));
    }

}
