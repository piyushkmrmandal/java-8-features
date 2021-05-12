package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerStudent {

    private static final List<Student> studentList = StudentDataBase.getAllStudents();
    public static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    public static Consumer<Student> studentNameAndActivities = (student) -> {
        System.out.print(student.getName());
        System.out.println(student.getActivities());
    };


    public static void printAllStudents(){
        System.out.println("Inside printAllStudents method");
        studentList.forEach(studentConsumer);
    }

    public static void printNamesAndActivities(){
        System.out.println("\nInside printNamesAndActivities method");
        studentList.forEach(studentConsumer.andThen(studentNameAndActivities));
    }

    public static void printDetailsOnCondition(){
        System.out.println("\nInside printDetailsOnCondition method");
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3){
                studentNameAndActivities.andThen(studentConsumer).accept(student);
            }
        }));
    }



    public static void main(String[] args) {
        //printAllStudents();
        //printNamesAndActivities();
        printDetailsOnCondition();

    }
}
