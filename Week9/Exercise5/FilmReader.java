package Week9.Exercise5;

import Week9.robodog.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilmReader {
    FileReader fileReader=new FileReader();
    public List<Film> getFilms(String filePath){
        return fileReader.asStream(filePath)
                .skip(1)
                .map(e->e.split(";"))
                .map(e -> Arrays.asList(e))
                .map(e -> new Film(Long.valueOf(e.get(0)),Long.valueOf(e.get(5)),Integer.valueOf(e.get(6)),e.get(8),Double.valueOf(e.get(9)),Integer.valueOf(e.get(10))))
                .collect(Collectors.toList());



    }
}
