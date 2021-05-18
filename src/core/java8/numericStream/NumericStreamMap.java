package core.java8.numericStream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMap {

    public static List<Integer> mapToObj(){
        return  IntStream.rangeClosed(1,5)
                .mapToObj((i)->{
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static Long mapToLong(){
        return IntStream.rangeClosed(1,5) //IntStream
                //i is passed from IntStream
                .mapToLong((i)->i)//converts IntStream to LongStream
                .sum();
    }

    public static OptionalDouble mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i -> i)
                .average();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj : " + mapToObj());
        System.out.println("mapToLong : " + mapToLong());
        System.out.println("mapToDouble : " + (mapToDouble().isPresent() ? mapToDouble().getAsDouble() : 0));
    }
}
