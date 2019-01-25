package Week10.ReflectionWeek10;

import Week9.robodog.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceReader {
    FileReader fileReader=new FileReader();

    public List<String> asList(String path){
        return  fileReader.asStream(path)
                .map(e -> e.replace(","," "))
                .map(e -> e.replace(";"," "))
                .map(e -> e.replace("’s"," "))
                .map(e -> e.replace("’"," "))
                .map(e -> e.replace("‘"," "))
                .map(e -> e.replace(":"," "))
                .map(e -> e.replace("#"," "))
                .map(e -> e.replace("/"," "))
                .map(e -> e.replace("-"," "))
                .map(e->e.toLowerCase())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }

}









