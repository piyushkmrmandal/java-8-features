package core.java8.streamapi;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static int performMultiplication(List<Integer> list){
        return list.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performAddition(List<Integer> list){
        return list.stream()
                .reduce((a,b)->a+b);
    }


    //Get the student details having highest GPA
    public static Optional<Student> studentHavingHighestGpa(){
        List<Student> list = StudentDataBase.getAllStudents();
//        Optional<Student> student = list.stream()
//                .reduce((a,b) -> {
//                    if(a.getGpa()>b.getGpa())
//                        return a;
//                    else
//                        return b;
//                });
        Optional<Student> student = list.stream()
                .reduce((s1, s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
        return student;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,6,8,3,4,9);
        List<Integer> integerList1 = new ArrayList<>();

        System.out.println("The multiplication is :: "+performMultiplication(integerList));

        Optional<Integer> additionResult = performAddition(integerList);
        System.out.println("The result of addition is :: "+ additionResult.isPresent());
        System.out.println("The result of addition is :: "+ additionResult.get());

        Optional<Integer> additionResult1 = performAddition(integerList1);
        System.out.println("The result of addition1 is :: "+ additionResult1.isPresent());

        Optional<Student> highestGpaStudent = studentHavingHighestGpa();
        if(highestGpaStudent.isPresent())
            System.out.println("Highest GPA holding student is : "+highestGpaStudent);
        else
            System.out.println("No records found");
    }
}
