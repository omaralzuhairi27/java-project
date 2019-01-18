package Week8.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AndMark implements Decrypt {
    @Override
    public String decrypt(String line) {
        String newLine = line.replaceAll("&", "");
        String[] immutable = newLine.split("");
        List <String> mutable = Arrays.asList(immutable);
        Collections.reverse(mutable);


        return String.join("", mutable);
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("&");
    }

}
