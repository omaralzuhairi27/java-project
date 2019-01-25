package Week9.ExerciseSolutions.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {

    public static void main(String[] args) {
        List<Integer> numbers = getNumbers(20);
        displayEvenNumbers(numbers);
        displayOddNumbers(numbers);
        displayNumbersDivisibleBy3BiggerThan10(numbers);
        displayNumbersSmallerThan5MultipliedBy3(numbers);
        displayNumberOfDigitsOfNumbersBiggerThan8andSmallerThan12(numbers);
    }

    private static List<Integer> getNumbers(int amount) {
        List<Integer> numbers = new ArrayList<>();
        for (int times = 1; times <= amount; times++) {
            numbers.add(times);
        }
        return numbers;
    }

    private static void displayEvenNumbers(List<Integer> numbers) {
        List<Integer> even = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers:");
        System.out.println(even);
    }

    private static void displayOddNumbers(List<Integer> numbers) {
        List<Integer> odd = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers:");
        System.out.println(odd);
    }

    private static void displayNumbersDivisibleBy3BiggerThan10(List<Integer> numbers) {
        List<Integer> divisibleBy3BiggerThan10 = numbers.stream()
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10:");
        System.out.println(divisibleBy3BiggerThan10);
    }

    private static void displayNumbersSmallerThan5MultipliedBy3(List<Integer> numbers) {
        List<Integer> smallerThan5MultipliedBy3 = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3:");
        System.out.println(smallerThan5MultipliedBy3);
    }

    private static void displayNumberOfDigitsOfNumbersBiggerThan8andSmallerThan12(List<Integer> numbers) {
        List<String> digits = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> e.toString())
                .map(e -> "number " + e + " has " + e.length() + " digits")
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12:");
        System.out.println(digits);
    }


}
