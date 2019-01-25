package Week10.Exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class CharactersApp {
    CharactersReader reader = new CharactersReader();

    public static void main(String[] args) {
        CharactersReader charactersReader = new CharactersReader();
        List <Character> characters = charactersReader.bookAsList();
        CharactersApp app = new CharactersApp();
        app.totalVharactersAppearInTheBooks(characters);
        app.charactersDied(characters);
        app.percentageOfMenAndWomenThatDied(characters);

    }

    public void totalVharactersAppearInTheBooks(List <Character> characters) {
        long charactersAppear = characters.stream()
                .map(e -> e.getName())
                .count();
        System.out.println(charactersAppear);
    }

    public void charactersDied(List <Character> characters) {
        long count = characters.stream()
                .map(e -> e.getDeathChapter())
                .filter(e ->!e.isEmpty())
                .count();
        System.out.println(count);
    }

    public void percentageOfMenAndWomenThatDied(List<Character> characters){
        Integer size=characters.size();
        String collect = characters.stream()
                .filter(e -> e.getDeathYear().isEmpty())
                .map(e -> e.getGender())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey().toString().replace("0", "Women")
                        .replace("1", "Men")
                        + " " + e.getValue() * 100 / size)
                .collect(Collectors.joining("%  ", " Men and Women the died: ", "% "));
        System.out.println(collect);
    }



}
/*
How many characters appear in the books in total?
How many characters died?
Display the overall percentage of men and women that died in all books.
Which book has the biggest death count with how many?
Who died in that book?
Which ones are the two allegiances that have the biggest dead count?
Which percentage of deaths belong to nobility characters?
In which book die the most amount of characters from the Stark allegiance?
In which book die the most amount of characters from the Lannister allegiance?
How many Starks have died?
How many Lannisters have died?
Is there any character who didn’t die?
Has any character ever been killed in the same chapter that it got introduced?

 */