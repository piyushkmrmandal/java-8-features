package core.java8.StreamTerminalOperations;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningCollector {

    public static String joining1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining_1" + joining1());
        System.out.println("Joining_2: " + joining2());
        System.out.println("Joining_3: " + joining3());
    }
}
