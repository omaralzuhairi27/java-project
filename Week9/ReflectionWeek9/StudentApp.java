package Week9.ReflectionWeek9;

import Week9.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentApp {


    private static List<String> readStudentFile(){
        FileReader fileReader=new FileReader();
        return fileReader.asStream("Week9/ReflectionWeek9/students-performance.csv")
                .skip(1)
                .collect(Collectors.toList());
    }
    private static void displayNumberOfBoysAndGirls(List<String> students){
        long females = students.stream()
                .map(e -> e.split(";"))
                .filter(e -> e[0].contains("female"))
                .count();
        Long males=students.size()-females;
        System.out.println("Number Of Female: " +females);
        System.out.println("Number Of Male: " +males);


    }
    public static void displayDistinctParentalEducationLevelsSortedAlphabetically(List<String> students){
        List<String> educationLevels=students.stream()
                .map(e->e.split(";"))
                .map(e->e[1])
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically:");
        System.out.println(educationLevels);
    }
    private static void displayNumberOfStudentsWithScoresHigherThan90(List<String> students){
        long count = students.stream()
                .map(e -> e.split(";"))
                .map((e -> ((Integer.valueOf(e[2]) + Integer.valueOf(e[3]) + Integer.valueOf(e[4]))/3)))
                .filter(e->e>90)

                .count();
        System.out.println("Number of students with scores higher than 90: " + count);

    }



    public static void main(String[] args) {
        List<String> entries=readStudentFile();
        displayNumberOfBoysAndGirls(entries);
        displayDistinctParentalEducationLevelsSortedAlphabetically(entries);
        displayNumberOfStudentsWithScoresHigherThan90(entries);
    }

}
