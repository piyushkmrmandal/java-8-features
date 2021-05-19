package core.java8.optional;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentName(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        if (student.isPresent()) {
            return student.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> output = getStudentName();
        if(output.isPresent())
            System.out.println("Length of the student name : " + output.get().length());
        else
            System.out.println("Object not found");
    }
}
