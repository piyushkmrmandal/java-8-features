package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFilter {

    public static List<String> getOnlyFemaleMembersName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGender().equalsIgnoreCase("female")))
                .map(Student::getName)
                .collect(toList());
    }

    public static List<Student> getMaleStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGender().equalsIgnoreCase("male")))
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());
    }

    public static void main(String[] args) {
        getOnlyFemaleMembersName().forEach(System.out::println);

        System.out.println("Male students with gpa >= 3.9 :");
        getMaleStudents().forEach(student -> System.out.println(student.getName()));

    }
}
