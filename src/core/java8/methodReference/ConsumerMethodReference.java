package core.java8.methodReference;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> listOfActivities = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(listOfActivities);
    }
}
