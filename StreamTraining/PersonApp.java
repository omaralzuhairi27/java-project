package StreamTraining;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonApp {
   public static List<Person> persons =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));
    public static void main(String[] args) {
        List <Person> p = persons.stream()
                .filter(e -> e.name.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(p);

        Map <Integer, List <Person>> collect = persons.stream()
                .collect(Collectors.groupingBy(e -> e.age));
        collect.forEach((age,pe)->System.out.format("age %s: %s\n",age,pe));


        Double collect1 = persons.stream()
                .collect(Collectors.averagingInt(e -> e.age));
        System.out.println(collect1);


        IntSummaryStatistics collect2 = persons.stream()
                .collect(Collectors.summarizingInt(e -> e.age));
        System.out.println(collect2);




    }
}
