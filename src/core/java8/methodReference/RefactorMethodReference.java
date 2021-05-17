package core.java8.methodReference;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

    //static Predicate<Student> predicate = (student) -> student.getGradeLevel()>=3;

    /**
     * Refactoring above line to use method reference
     * @param s
     * @return
     */
    static Predicate<Student> predicate = RefactorMethodReference::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel()>=2;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
    }
}
