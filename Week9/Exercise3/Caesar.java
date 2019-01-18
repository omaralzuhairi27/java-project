package Week9.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    List <String> letters = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    public String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(e -> encrypt(e, key))
                .collect(Collectors.joining());
    }


    public String encrypt(String letter, Integer key) {
        char character = letter.charAt(0);
        if(!Character.isAlphabetic(character)){
            return letter;
        }

        Integer position = letters.indexOf(letter.toLowerCase());
        int shifted = (position + key) % letters.size();
        String cipherLetter = letters.get(shifted);

        if (Character.isUpperCase(character)) {
            return cipherLetter.toUpperCase();
        }
        return cipherLetter;
    }

}
