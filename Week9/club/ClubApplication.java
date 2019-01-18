package Week9.club;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ClubApplication {

    public static void main(String[] args) {
        List<Clubber> clubbers = Arrays.asList(new Clubber("El", 24),
                new Clubber("Niklas", 19),
                new Clubber("Lisa", 15),
                new Clubber("John", 22));

        Optional<String> first = clubbers.stream()
                .filter(e -> e.getAge() >= 18)
                .map(e -> e.getName())
                .sorted()
                .findFirst();

        if (first.isPresent()) {
            System.out.println("The first is: " + first.get());
        } else {
            System.out.println("The conditions were too hard to meet.");
        }

    }

}
