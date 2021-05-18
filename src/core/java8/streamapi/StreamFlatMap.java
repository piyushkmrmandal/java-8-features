package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMap {

    private static List<String> studentActivities = printStudentActivities();

    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .collect(toList());
        return studentActivities;
    }

    //distinct() of stream to get unique elements from a stream
    public static List<String> distinctActivities(){

        List<String> uniqueActivities = studentActivities.stream()
                .distinct()
                .collect(toList());
        return uniqueActivities;
    }

    //count() of stream to get count of the activities from stream
    public static Long countActivities(){
        List<String> activities = distinctActivities();
        Long count = activities.stream().count();
        return count;
    }

    //sorted() of stream to sort the elements of activities from stream
    public static List<String> sortedActivities(){
        List<String> activities = distinctActivities();
        List<String> sortedActivities = activities.stream().sorted()
                .collect(toList());
        return sortedActivities;
    }

    public static void main(String[] args) {
        System.out.println(distinctActivities());
        System.out.println(countActivities());
        System.out.println(sortedActivities());

    }
}
