package core.java8.numericStream;

import java.io.InputStream;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregate {

    public static void main(String[] args) {
        //sum()
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : "+sum);

        //max()
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println("Maximum value is: "+(max.isPresent()?max.getAsInt():0));

        //min()
        OptionalLong min = LongStream.rangeClosed(20,60).min();
        System.out.println("Minimum value is: " + (min.isPresent() ? min.getAsLong() : 0));

        //average()
        OptionalDouble avg = IntStream.rangeClosed(1,50).average();
        System.out.println("Average of the range is : " + (avg.isPresent() ? avg.getAsDouble() : 0));



    }
}
