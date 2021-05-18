package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {

    //to fetch all the names of Students and store it in a list

    public static void main(String[] args) {
        List<String> names = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
