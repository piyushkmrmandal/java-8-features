package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    private static final Supplier<Student> studentSupplier= ()->
            new Student("Piyush",3,3.5,"male", Arrays.asList("swimming","riding"), 10);
    private static Supplier<List<Student>> studentListSupplier = ()-> StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        System.out.println(studentListSupplier.get());
        System.out.println(studentSupplier.get());
    }
}
