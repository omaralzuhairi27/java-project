package Week9.ExerciseSolutions.ex3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public static final int LOWERCASE_A_ASCII = 97;

    public String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(letter -> cipherLetter(letter, key))
                .collect(Collectors.joining());
    }

    private String cipherLetter(String letter, Integer key) {
        if (isNotAlphabetic(letter)) {
            return letter;
        }
        boolean wasUpperCase = isUpperCase(letter);
        int ascii = letter.toLowerCase().charAt(0);
        int shiftedAscii = (ascii + key - LOWERCASE_A_ASCII) % 26 + LOWERCASE_A_ASCII;
        char shiftedCharacter = (char) shiftedAscii;
        String cipherLetter = String.valueOf(shiftedCharacter);
        if (wasUpperCase) {
            cipherLetter = cipherLetter.toUpperCase();
        }
        return cipherLetter;
    }


    private boolean isNotAlphabetic(String letter) {
        return !Character.isAlphabetic(letter.charAt(0));
    }

    private boolean isUpperCase(String letter) {
        return Character.isUpperCase(letter.charAt(0));
    }

    public static void main(String[] args) {
        Caesar caesar=new Caesar();
        caesar.cipher("b",3);
    }

}
