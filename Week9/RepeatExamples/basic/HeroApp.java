package Week9.RepeatExamples.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeroApp {
    public static void main(String[] args) {
        List <String> heroes = Stream.of("Batman", "Wonder Woman", "Iron Man",
                "Cat Woman", "Flash", "Thor", "Omar Man")
                .collect(Collectors.toList());
        System.out.println(heroes);

        String herosTogther = heroes.stream()
                .collect(Collectors.joining("; "));
        System.out.println(herosTogther);

        heroes.stream()
                .filter(e->e.contains(" "))
                .forEach(e-> System.out.print(e+" "));
        heroes.stream()
                .filter(e->e.contains(" "))
                .map(e->e +": Super Hero")
                .forEach(e-> System.out.println(e));

    }
}
