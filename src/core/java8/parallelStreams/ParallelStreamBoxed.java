package core.java8.parallelStreams;

import java.util.List;
import java.util.stream.IntStream;
/**
 * When not to use parallelStream
 */

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxed {

    public static int sequentialSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.stream()
                        .reduce(0,(x,y) -> x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration in sequential stream : "+ (endTime - startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> integers){
        long startTime = System.currentTimeMillis();
        int sum = integers.parallelStream()
                .reduce(0,(x,y) -> x+y);//performs the unboxing from Integer to int and thus parallelStream take more time
        long endTime = System.currentTimeMillis();
        System.out.println("Duration in parallel stream : "+ (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());
        sequentialSum(integers);
        parallelSum(integers);
    }
}
