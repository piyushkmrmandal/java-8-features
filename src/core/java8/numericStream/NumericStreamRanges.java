package core.java8.numericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRanges {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        IntStream intStream1 = IntStream.rangeClosed(1,50);
        System.out.println(intStream1.count());

        LongStream longStream = LongStream.range(1,50);
        System.out.println(longStream.count());

        LongStream longStream1 = LongStream.rangeClosed(1,50);
        System.out.println(longStream1.count());

        DoubleStream doubleStream = IntStream.range(1,50).asDoubleStream();
        System.out.println(doubleStream.count());

        DoubleStream doubleStream1 = IntStream.rangeClosed(1,50).asDoubleStream();
        System.out.println(doubleStream1.count());
    }
}
