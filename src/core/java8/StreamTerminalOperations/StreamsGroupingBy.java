package core.java8.StreamTerminalOperations;

import core.java8.data.Student;
import core.java8.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingBy {

    /**
     * groupingBy(Classifier)
     */
    public static Map<String, List<Student>> groupByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        return studentMap;
    }

    public static Map<String, List<Student>> customizedGroupByGpa(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
        return studentMap;
    }

    /**
     * groupingBy(classifier, downStream)
     */
    public static void twoLevelGrouping_1(){
          Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                  .stream()
                  .collect(groupingBy(Student::getGradeLevel,
                          groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNotebooks)));
        System.out.println(studentMap);
    }

    /**
     *groupingBy(classifier, supplier, downstream)
     */
    public static void threeArgumentGroupBy(){
         LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                            .stream()
                            .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentLinkedHashMap);
    }

    /**
     * maxBy() with groupingBy()
     */
    public static void calculateTopGpa(){
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional);
    }

    /**
     * minBy() with groupingBy()
     */
    public static void calculateLeastGpa(){
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional);
    }

    public static void main(String[] args) {
        //System.out.println(groupByGender());
        //System.out.println(customizedGroupByGpa());
        //twoLevelGrouping_1();
        //twoLevelGrouping_2();
        //threeArgumentGroupBy();
        //calculateTopGpa();
        calculateLeastGpa();
    }
}
