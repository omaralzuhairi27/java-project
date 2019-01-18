package Week8.Exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {


    private Integer getASCII(String name, Function <String, Integer> function) {
        List <String> letters = Arrays.asList(name.split(""));
        int sum = 0;
        for (String letter : letters) {
            sum += function.apply(letter);
        }
        return sum;
    }

    public Integer scout(String name) {
        return getASCII(name, letter -> (int) letter.charAt(0));
    }

    public Integer scoutEnhanced(String name) {
        return getASCII(name, letter -> (int) letter.toLowerCase().charAt(0));
    }


}
