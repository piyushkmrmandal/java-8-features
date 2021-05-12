package core.java8.imperativeDeclarative;

import java.io.InputStream;
import java.util.stream.IntStream;

public class ImperativeDeclarative {
    public static void main(String[] args) {
        /**
         * To Print Sum of 100 numbers using imperative and declarative programming approach
         */

        /**
         * Imperative - HOW style of programming
         */
        int sum = 0;
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        for(int i=0;i<=100;i++){
            sum += i;
        }
        long totalTimeTaken = endTime - startTime;
        System.out.println("Sum using Imperative approach is::"+sum);
        System.out.println("Time taken by Imperative approach::"+totalTimeTaken);

        /**
         * Declarative - WHAT style of programming
         */

        long startTimeD = System.nanoTime();
        int sumD = IntStream.rangeClosed(0,100)
                .sum();
        long endTimeD = System.nanoTime();
        long totalTimeTakenD = endTimeD-startTimeD;
        System.out.println("Sum using Declarative approach is::"+sumD);
        System.out.println("Time taken by Declarative approach::"+totalTimeTakenD);

        //Using parallelStream
        long startTimeDP = System.nanoTime();
        int sumDP = IntStream.rangeClosed(0,100)
                .parallel()
                .sum();
        long endTimeDP = System.nanoTime();
        long totalTimeTakenDP = endTimeDP-startTimeDP;
        System.out.println("Sum using Declarative approach is::"+sumDP);
        System.out.println("Time taken by Declarative approach::"+totalTimeTakenDP);

    }
}
