package Week10.Exercise2;

import Week9.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    //gender;parental level of education;math score;reading score;writing score
    public List<Student> getStudents(String path){
        FileReader reader=new FileReader();
        return reader.asStream(path)
                .skip(1)
                .map(e -> e.split(";"))
                .map(e->new Student(e[0],e[1],Integer.valueOf(e[2]),Integer.valueOf(e[3]),Integer.valueOf(e[4])))
                .collect(Collectors.toList());
    }
}
