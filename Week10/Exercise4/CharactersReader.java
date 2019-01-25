package Week10.Exercise4;

import Week9.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharactersReader {
    FileReader fileReader=new FileReader();
    public List<Character> bookAsList(){
        return fileReader.asStream("Week10/Exercise4/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Character(
                        e[0],
                        e[1],
                        e[2],
                        e[3],
                        e[4],
                        e[5],
                        Integer.valueOf(e[6]),
                        Integer.valueOf(e[7]),
                        Integer.valueOf(e[8]),
                        Integer.valueOf(e[9]),
                        Integer.valueOf(e[10]),
                        Integer.valueOf(e[11]),
                        Integer.valueOf(e[12])))
                .collect(Collectors.toList());
    }
}
