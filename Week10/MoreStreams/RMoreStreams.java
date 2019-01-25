package Week10.MoreStreams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RMoreStreams {
    public static void main(String[] args) {
        String quote = "If you want to find the secrets of the universe, think in terms of energy, frequency and vibration.";

        List<String> words= Stream.of(quote.split(" "))
                .map(e->e.replaceAll(",",""))
                .map(e->e.replaceAll("\\.",""))
                .collect(Collectors.toList());
        System.out.println("Words: "+words);

        System.out.println("How many times each word appears:");

        Map <String, Long> wordAppearance = words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(wordAppearance);

        System.out.println("Which word appears the most:");

        Optional <String> mostAppeared = wordAppearance.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " appears " + e.getValue() + " times ")
                .findFirst();
        if(mostAppeared.isPresent()){
            System.out.println("Most appearing word: "+ mostAppeared.get());
        }

        List <String> mostAppearigThreeletters = words.stream()
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        System.out.println("most Appearing Three letters; ");
        mostAppearigThreeletters.forEach(System.out::println);

        boolean isThereOneWordWithLength = words.stream()
                .map(word -> word.length())
                .anyMatch(length -> length > 7);
        System.out.println("Amy match: "+ isThereOneWordWithLength);

        Map <Integer, List <String>> wordLengths = words.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));


        System.out.println("Word lengths: ");
        wordLengths.entrySet().stream()
                //.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(e->e.getKey()+" | "+ e.getValue())
                .forEach(System.out::println);

        boolean allWordsHaveAtLeastNLetters = words.stream()
                .allMatch(e -> e.length() >= 3);
        System.out.println("All the words hava at least 3 letters  "+ allWordsHaveAtLeastNLetters);


    }
}
