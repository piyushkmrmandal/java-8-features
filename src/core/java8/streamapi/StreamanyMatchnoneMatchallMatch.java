package core.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamanyMatchnoneMatchallMatch {

    public static Boolean anyMatchCaseTrue(List<Integer> list){
        Boolean flag = list.stream()
                .anyMatch((a)->a%6==0);
        return flag;
    }
    public static Boolean anyMatchCaseFalse(List<Integer> list){
        Boolean flag = list.stream()
                .anyMatch((a)->a%12==0);
        return flag;
    }
    public static Boolean allMatchCase(List<Integer> list){
        Boolean flag = list.stream()
                .allMatch((a)->a%2==0);
        return flag;
    }

    public static Boolean noneMatchCase(List<Integer> list){
        Boolean flag = list.stream()
                .noneMatch((a)->a%7==0);
        return flag;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);

        System.out.println("Result for anyMatch Cases: ");
        System.out.println("In case of true: "+anyMatchCaseTrue(list));
        System.out.println("In case of false: "+anyMatchCaseFalse(list));
        System.out.println("-----------------------------------------------");

        System.out.println("Result for allMatch Cases: ");
        System.out.println(allMatchCase(list));

        System.out.println("Result for noneMatch Cases: ");
        System.out.println(noneMatchCase(list));

    }
}
