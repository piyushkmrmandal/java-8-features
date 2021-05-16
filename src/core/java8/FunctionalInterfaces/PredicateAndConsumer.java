package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {

    Predicate<Student> predicateGradeLevel = (student) -> student.getGradeLevel()>=3;
    Predicate<Student> predicateGpaLevel = (student) -> student.getGpa()>=3.9;

    BiConsumer<String, List<String>> studentData =
            (name, activities) -> System.out.println(name+" : "+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(predicateGradeLevel.and(predicateGpaLevel).test(student))
            studentData.accept(student.getName(),student.getActivities());
    });

    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumer().printNameAndActivities(studentList);
    }
}
