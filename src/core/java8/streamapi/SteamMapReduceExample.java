package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;

public class SteamMapReduceExample {

    private static List<Student> list = StudentDataBase.getAllStudents();

    public static int totalNotebooks(){
        return list.stream()
                .filter((student -> student.getGradeLevel()>=3))
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getNotebooks)
                //.reduce(0,(a,b) -> a+b);
                .reduce(0,Integer::sum);//alternative approach
    }

    public static void main(String[] args) {
        System.out.println("Total Number of notebooks : "+totalNotebooks());
    }

}
