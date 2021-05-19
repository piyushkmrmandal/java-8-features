package core.java8.parallelStreams;

import java.util.stream.IntStream;

/**
 * Example to show that parallel stream must not be used with the mutable objects/variables
 */

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()//here parallel stream is giving different result when run everytime
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());
    }
}
