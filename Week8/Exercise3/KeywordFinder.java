package Week8.Exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    private List <String> findAWord(String text, Predicate <String> condation) {
        String[] immutableWords = text.split(" ");
        List <String> words = Arrays.asList(immutableWords);
        List <String> newWords = new ArrayList <>();
        for (String word : words) {
            if (condation.test(word)) {
                newWords.add(word);
            }
        }
        return newWords;
    }
    public List<String> getElegantCondation(String text){
        return findAWord(text,e -> e.startsWith("ele"));
    }
    public List<String> getPlayfulCondation(String text){
        return findAWord(text,e -> e.endsWith("ful"));
    }

}
