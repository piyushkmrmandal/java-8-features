package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {

    private static Predicate<Student> predicate = (s)->s.getGradeLevel()>=3;
    private static Predicate<Student> predicateGpa = (s)->s.getGpa()>=3.9;
    private static List<Student> list = StudentDataBase.getAllStudents();

    public static void filterStudentsBasedOnGradeLevel(){
        list.forEach(student -> {
            if(predicate.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsBasedOnGradeLevelAndGpa(){
        list.forEach(student -> {
            if(predicate.and(predicateGpa).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        //filterStudentsBasedOnGradeLevel();
        filterStudentsBasedOnGradeLevelAndGpa();
    }
}
