package Week9.Exercise2;

import Week9.robodog.FileReader;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {
    FileReader fileReader=new FileReader();
    String path="Week9/Exercise2/names.txt";
    List<String> names=fileReader.asList(path);
    @Test
    void checkShourtNames(){

       List<String> nameAsList=names.stream()
               .filter(e->e.length()<4)
               .collect(Collectors.toList());
       List<String> expected= Arrays.asList( "El");
       assertEquals(expected,nameAsList);

    }
    @Test
    void namesEndWithM(){
        List<String> nameAsList=names.stream()
                .filter(e->e.endsWith("m"))
               // .map(e->changeLastLetter(e))
                .collect(Collectors.toList());
        List<String> expected=Arrays.asList("HOSAM" ,"TAMMAM");
        assertEquals(expected,nameAsList);
    }



    @Test
    void namesContainEAnsR(){
        List<String> nameAsList=names.stream()
                .filter(e->e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected=Arrays.asList("Mehran", "Norbert", "Serife");
        assertEquals(expected,nameAsList);

    }
    @Test
    void  namesNiggerThanSix(){
        List<String> nameAsList=names.stream()
                .map(e->e.toLowerCase())
                .filter(e->e.contains("a")&&e.contains("m"))
                .filter(e->e.length()==4)
                .map(e->e.replaceAll("a","aa"))
                .collect(Collectors.toList());
        System.out.println(nameAsList);

    }

}