package core.java8.parallelStreams;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample {
    //private static List<String> studentActivities = printStudentActivities();

    public static List<String> sequentialPrintStudentActivities(){
        Long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken in sequential execution : "+ (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        Long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .parallel()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken in Parallel execution : "+ (endTime - startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();

    }
}
