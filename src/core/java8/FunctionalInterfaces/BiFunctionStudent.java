package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionStudent {

    private static  Predicate<Student> predicate = (student -> student.getGradeLevel()>=3);

    private static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> function =
            ((students, studentPredicate) -> {
                Map<String, Double> filteredStudents = new HashMap<>();
                students.forEach(student -> {
                    if(studentPredicate.test(student))
                        filteredStudents.put(student.getName(), student.getGpa());
                });
                return filteredStudents;
            });

    public static void main(String[] args) {
        System.out.println(function.apply(StudentDataBase.getAllStudents(), predicate));
    }
}
