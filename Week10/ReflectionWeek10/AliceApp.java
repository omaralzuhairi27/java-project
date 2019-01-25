package Week10.ReflectionWeek10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceApp {
    public Long wordsAreInTheBook(List <String> text) {
        long count = text.stream()
                .count();
        return count;
    }

    public void distinctWordsAreInTheBook(List <String> text) {
        Stream <String> distinct = text.stream()
                .distinct();
        long count = distinct.count();
        System.out.println("Number of distinct words: " + count);


    }

    public void wordsBelongToTheGroupOfTheLongestWords(List<String> text){
        text.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .map(e -> e.getKey() +" " +e.getValue())
                .limit(1)
                .forEach(System.out::println);


    }
   public void theMostAppeare5Words(List<String> words){
       Map<String, Long> wordsAppearances = words.stream()
               .filter(e->!e.isEmpty())
               .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
       wordsAppearances.entrySet().stream()
               .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
               .map(e -> e.getValue() + " | " + e.getKey() )
               .limit(5)
               .forEach(System.out::println);


   }


    public static void main(String[] args) {
        AliceReader aliceReader = new AliceReader();
        List <String> words = aliceReader.asList("Week10/ReflectionWeek10/alice.txt");

        AliceApp aliceApp = new AliceApp();
        System.out.println("Number of words: " + aliceApp.wordsAreInTheBook(words));
        aliceApp.distinctWordsAreInTheBook(words);
        aliceApp.wordsBelongToTheGroupOfTheLongestWords(words);
        aliceApp.theMostAppeare5Words(words);

    }
}
/*

Which words belong to the group of the longest words?
Which ones are the most appearing 5 words, sorted by most appearing and how many times do they appear?
Which ones are the most appearing 5 letters, sorted by most appearing and how many times do they appear?
How many times does the name Alice appear?

 */