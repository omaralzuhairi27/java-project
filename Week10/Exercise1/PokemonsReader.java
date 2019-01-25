package Week10.Exercise1;

import Week9.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonsReader {

    /*
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hitPoints;
    private Integer attack;
    private Integer defense;
    private Integer speedAtk;
    private Integer speedDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;
     */

    public List <Pokemon> asList(String path) {
        FileReader fileReader = new FileReader();
        return fileReader.asStream(path)
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Pokemon(
                        Integer.valueOf(e[0]),
                        e[1],
                        e[2],
                        e[3],
                        Integer.valueOf(e[4]),
                        Integer.valueOf(e[5]),
                        Integer.valueOf(e[6]),
                        Integer.valueOf(e[7]),
                        Integer.valueOf(e[8]),
                        Integer.valueOf(e[9]),
                        Integer.valueOf(e[10]),
                        Integer.valueOf(e[11]),
                        Boolean.valueOf(e[12])))
                .collect(Collectors.toList());

    }
}
