package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudent {

    private static Function<List<Student>, Map<String, Double>> studentFunction =
            (students -> {
                Map<String, Double> studentsGpa = new HashMap<>();
                students.forEach(student -> studentsGpa.put(student.getName(),student.getGpa()));
                return studentsGpa;
            });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
