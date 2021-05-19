package core.java8.optional;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElse {

    /**
     * orElse
      */

    public static String optionalOrElse(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // return Optional.empty
        String name = studentOptional.map(Student::getName).orElse("Not Found");
        return name;
    }

    /**
     * orElseGet - it accepts a supplier input
     */
    public static String optionalOrElseGet(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }

    /**
     * orElseThrow-accepts a supplier as input and used to throw exception
     */
    public static  String optionalOrElseThrow(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Name Found"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("orElse : " + optionalOrElse());
        System.out.println("orElseGet : " + optionalOrElseGet());
        System.out.println("orElseThrow : "+ optionalOrElseThrow());
    }
}
