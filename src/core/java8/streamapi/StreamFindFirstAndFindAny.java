package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamFindFirstAndFindAny {

    private static List<Student> students = StudentDataBase.getAllStudents();

    public static Optional<Student> findFirstCase(){
        return students.stream()
                .filter((student -> student.getGpa()>=3.9))
                .findFirst();//Returns first element of the stream
    }

    public static Optional<Student> findAnyCase(){
        return students.stream()
                .filter((student -> student.getGpa()>=3.9))
                .findAny(); //Returns first element encountered in the stream
    }

    public static void main(String[] args) {

        Optional s1 = findFirstCase();
        if(s1.isPresent())
            System.out.println(s1);

        Optional s2 = findAnyCase();
        if(s2.isPresent())
            System.out.println(s2);

    }
}
