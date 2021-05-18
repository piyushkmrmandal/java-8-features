package core.java8.numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingAndUnboxing {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //Input - int
                .boxed()
                //Output - Integer
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> list){
        //wrapper to primitive
        return list.stream()
                //wrapper Integer values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing: "+ boxing());

        List<Integer> integerList = boxing();
        System.out.println("Unboxing sum is: "+unboxing(integerList));
    }
}
