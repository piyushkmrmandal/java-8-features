package core.java8.StreamTerminalOperations;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMaxByMinBy {

    public static Optional<Student> minByExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("Least holding GPA candidate is : " + minByExample());
        System.out.println("Highest holding GPA candidate is : " + maxByExample());
    }

}
