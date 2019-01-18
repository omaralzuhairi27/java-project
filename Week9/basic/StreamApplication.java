package Week9.basic;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {

    public static void main(String[] args) {
        List<String> names = Stream.of("Batman", "Wonder Woman", "Iron Man",
                "Cat Woman", "Flash", "Thor", "Omar Man")
                .collect(Collectors.toList());
        System.out.println(names);

        String namesTogether = names.stream()
                .collect(Collectors.joining("; "));
        System.out.println(namesTogether);

        names.stream()
                .filter(e -> !e.contains(" "))
                .forEach(e -> System.out.println(e));

        names.stream()
                .filter(e -> e.contains(" "))
                .map(e -> e.toUpperCase())
                .map(e -> e + " Superhero")
                .forEach(e -> System.out.println(e));

        List<Hero> heroes = names.stream()
                .filter(e -> !e.endsWith("man"))
                .map(name -> new Hero(name))
                .collect(Collectors.toList());

        heroes.stream()
                .map(hero -> hero.getName())
                .forEach(e -> System.out.println(e));

        heroes.stream()
                .filter(isNotSuperman())
                .filter(isNameShorterThan(6))
                .forEach(hero -> hero.saveTheCity());


    }


    private static Predicate<Hero> isNotSuperman() {
        return e -> !e.getName().equals("Superman");
    }

    private static Predicate<Hero> isNameShorterThan(int length) {
        return e -> e.getName().length() < length;
    }

}
