package core.java8.optional;

import core.java8.data.Bike;
import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapFilter {
    /**
     * Filter
     */
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa()>=3.5)
                       .ifPresent(student -> System.out.println(student));
    }

    /**
     * FlatMap
     */
    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional.filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        name.ifPresent(s->System.out.println("Name : " + s));
    }

    /**
     * Map
     */
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<String> name = studentOptional.filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println("Map method output : "+ name.get());
        }
    }

    public static void main(String[] args) {
        optionalMap();
        optionalFlatMap();
    }
}
