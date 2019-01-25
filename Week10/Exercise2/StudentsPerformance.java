package Week10.Exercise2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsPerformance {

    public void levelOfEducationAppear(List <Student> students) {
        Map <String, Long> groupByLevelEduction = students.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation, Collectors.counting()));
        System.out.println(groupByLevelEduction);
    }

    public void levelOfEducationsSortedFromMostAppear(List <Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .forEach(System.out::println);

    }

    public void masterDegreeAndLowerGradesThan60(List <Student> students) {
        long count = students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("master's degree"))
                .filter(e -> e.getWritingScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getMathScore() < 60)
                .count();
        System.out.println("Number of students with high parent education and lower scores than 60: " + count);
    }

    private Integer getAverage(Student student) {
        Integer mathScore = student.getMathScore();
        Integer readingScore = student.getReadingScore();
        Integer writingScore = student.getWritingScore();

        Integer sum = mathScore + readingScore + writingScore;
        int div = sum / 3;
        return div;
    }

    public void threeStudentsWithTheHighestAverageScore(List <Student> students) {
        students.stream()
                .sorted((e1, e2) -> getAverage(e2).compareTo(getAverage(e1)))
                .limit(3)
                .map(e -> getAverage(e) + " | " + e.getGender())
                .forEach(System.out::println);

    }

    public void levelOfSomeHighSchoolThatHasAtLeast95(List <Student> students) {
        students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("some high school"))
                .filter(e -> getAverage(e) >95)
                .map(e->getAverage(e)+" | "+ e.getGender())
                .forEach(System.out::println);
    }
    public void levelOfSomeHighSchoolThatHasAtLeast97(List<Student> students){
        boolean anyMatch = students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("some high school"))
                .anyMatch(e -> getAverage(e) >= 97);
        System.out.println(anyMatch);
    }

    public static void main(String[] args) {
        StudentReader studentReader = new StudentReader();
        List <Student> students = studentReader.getStudents("Week10/Exercise2/students-performance.csv");
        StudentsPerformance performance = new StudentsPerformance();
        System.out.println("Parent education level appearances:");
        performance.levelOfEducationAppear(students);
        System.out.println("Parent education level appearances sorted top bottom: ");
        performance.levelOfEducationsSortedFromMostAppear(students);
        performance.masterDegreeAndLowerGradesThan60(students);
        performance.threeStudentsWithTheHighestAverageScore(students);
        performance.levelOfSomeHighSchoolThatHasAtLeast95(students);
        performance.levelOfSomeHighSchoolThatHasAtLeast97(students);


    }

}
/*
    How many times does each parent level of education appear?
Which are the different parent level of educations sorted from most appearing to least appearing?
How many students have parents with a master’s degree and lower grades than 60 on each topic?
Which genders and average scores do the three students with the highest average score have?
Is there any student with a parent education level of some high school that has at least 95 in every topic?

     */
