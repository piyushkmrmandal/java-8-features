package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    //student name and activities in a map

    static Predicate<Student> studentPredicate = (student)-> student.getGradeLevel()>=3;
    static Predicate<Student> gpaPredicate = (student)-> student.getGpa()>=3.9;

    public static void main(String[] args) {

        Long start = System.nanoTime();
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        Long end = System.nanoTime();
        Long total = (end-start);
        System.out.println("Result of Sequential stream is in :: "+total+" ms");
       // System.out.println(studentMap);

        Long startSecond = System.nanoTime();
        Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents().parallelStream()
                .filter(studentPredicate)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        Long endSecond = System.nanoTime();
        Long totalSecond =(endSecond-startSecond);
        System.out.println("Result of Parallel stream is in :: "+totalSecond+" ms");
        System.out.println(total>totalSecond);
    }
}
