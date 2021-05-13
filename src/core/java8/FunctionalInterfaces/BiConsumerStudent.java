package core.java8.FunctionalInterfaces;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerStudent {

    private static List<Student> studentList = StudentDataBase.getAllStudents();
    private static BiConsumer<String, List<String>> nameAndActivities =
            (name, activities) -> System.out.println(name + " : "+ activities);

    public static void getNameAndActivities(){
        studentList.forEach(student -> nameAndActivities.accept(student.getName(), student.getActivities()));
    }

    public static void getNameAndActivitiesOnCondition(){
        studentList.forEach((student -> {
            if(student.getName().equalsIgnoreCase("emily"))
                nameAndActivities.accept(student.getName(), student.getActivities());
        }));
    }

    public static void main(String[] args) {
        getNameAndActivities();
        System.out.println();
        getNameAndActivitiesOnCondition();
    }

}
