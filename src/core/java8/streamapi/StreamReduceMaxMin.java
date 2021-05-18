package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamReduceMaxMin {

    private static List<Student> list = StudentDataBase.getAllStudents();

    public static Optional<Integer> getMaxNotebook(){
        return list.stream()
                .map(Student::getNotebooks)
                .reduce(Integer::max);
    }

    public static Optional<Integer> getMinNotebook(){
        return list.stream()
                .map(Student::getNotebooks)
                .reduce(Integer::min);
    }

    public static void main(String[] args) {

        Optional<Integer> maxCount = getMaxNotebook();
        if(maxCount.isPresent())
            System.out.println("Maximum notebook count is : "+maxCount.get());

        Optional<Integer> minCount = getMinNotebook();
        if(minCount.isPresent())
            System.out.println("Minimum notebook count is : "+minCount.get());

    }
}
