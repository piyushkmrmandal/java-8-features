package core.java8.StreamTerminalOperations;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamMappingCollector {

    public static void main(String[] args) {

        List<String> students = StudentDataBase.getAllStudents()
                                                .stream()
                                                .collect(mapping(Student::getName, toList()));
        System.out.println("nameList : "+students);
    }
}
