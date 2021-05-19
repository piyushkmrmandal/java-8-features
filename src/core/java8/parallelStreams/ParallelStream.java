package core.java8.parallelStreams;

import java.util.stream.IntStream;

public class ParallelStream {

    public static int sumSequential(){
        return IntStream.rangeClosed(1,1000)
                .sum();
    }
    public static int sumParallel(){
        return IntStream.rangeClosed(1,1000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential result is : "+ sumSequential());
        System.out.println("Parallel result is : "+sumParallel());
    }
}
