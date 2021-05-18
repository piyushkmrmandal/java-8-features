package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamComparator {

    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name : ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by Gpa : ");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by Gpa in descending order: ");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }

}
