package Week8.Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sensor {
    //ExclamationMark strategy1 = new ExclamationMark();
    // AndMark strategy2 = new AndMark();
    //HashTagMark strategy3 = new HashTagMark();
    List <Decrypt> marks = Marks.aslist();

    public String decryptLine(String line) {
        String newLine="";
        for (Decrypt mark : marks) {
            if (mark.isThere(line)) {
               newLine= mark.decrypt(line);
            }
        }
        return newLine ;
    }

    public Set <String> decryptTheText(List <String> lines) {
        List <String> newText = new ArrayList <>();
        for (String line : lines) {
            String newLine = decryptLine(line);

            newText.add(newLine);
        }
        Set <String> strings = new HashSet <>(newText);
        System.out.println("Number of unique tricks: " + strings.size());

        return strings;
    }

}
