package Week9.ReflectionWeek9;

import Week9.robodog.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentSummarizer {

    //gender;parental level of education;math score;reading score;writing score
    public static List <String> getStudent() {
        FileReader reader = new FileReader();
        List <String> students = reader.asList("Week9/ReflectionWeek9/students-performance.csv");
        students.stream()
                .skip(1)
                .map(e -> e.split(";"))
                .collect(Collectors.toList());
        return students;
    }

    public void studentNumber() {
        List <String> studentNumber = getStudent();
        studentNumber.stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.print("Total number of student performance entries: ");
        System.out.println(+studentNumber.size() - 1);

    }

    public void checkGirlsAndBoysNumber(String gender) {
        List <String> students = getStudent();
        long count = students.stream()
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> Arrays.asList(e))
                .map(e -> e.get(0))
                .filter(e -> e.equals(gender))
                .count();
        System.out.print("Number of " + gender + " students: ");
        System.out.println(count);
    }

    public void educationSortedAlphabetically() {
        List <String> students = getStudent();
        students.stream()
                .map(e -> e.split(";"))
                .map(e -> e[1])
                .sorted()
                .collect(Collectors.toSet())
                .forEach(e -> System.out.println(e));


    }

    public void scoresHigher() {
        List <String> students = getStudent();
        students.stream()
                .map(e -> e.split(";"))
                .map(e -> (Integer.valueOf(e[2]) + Integer.valueOf(e[3]) + Integer.valueOf(e[4])) / 3)
                .filter(e -> e > 90)
                .forEach(e -> System.out.println(e));

    }

    public static void main(String[] args) {
        StudentSummarizer summarizer = new StudentSummarizer();
        summarizer.studentNumber();
        summarizer.checkGirlsAndBoysNumber("female");
        summarizer.checkGirlsAndBoysNumber("male");
        summarizer.educationSortedAlphabetically();
       // summarizer.scoresHigher();

    }
}
/*
*
Which are the distinct parental levels of education sorted alphabetically?
How many students scored higher than a 90 on every topic?
How many students scored exactly 100 on every topic? Which ones are their genders?
*/