package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateStudent {

    private static List<Student> studentList = StudentDataBase.getAllStudents();

    private static BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;

    public static void main(String[] args) {
        studentList.forEach(student -> {
            if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa()))
                System.out.println(student);
        });
    }
}
