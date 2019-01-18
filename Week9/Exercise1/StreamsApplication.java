package Week9.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList <>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        List <Integer> evenNumber = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);

        List <Integer> oddNumber = numbers.stream()
                .filter(e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddNumber);

        List <Integer> divisibleByThere = numbers.stream()
                .filter(e -> e % 3 == 0 && e > 10)
                .collect(Collectors.toList());
        System.out.println(divisibleByThere);

        List <Integer> smallerThanFive = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println(smallerThanFive);

        List <Integer> biggerThan8AndSmallerThan12 = numbers.stream()
                .filter(e -> e < 12 && e > 8)
                .collect(Collectors.toList());
        System.out.println(biggerThan8AndSmallerThan12);

        numbers.stream()
                .filter(e -> e < 12 && e > 8)
                .map(e-> e.toString())
                .forEach(e -> System.out.println("Number "+e + " has "+e.length() + " digits"));

    }

}
