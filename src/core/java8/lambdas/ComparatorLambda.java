package core.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {

        /**
         * Prior java-8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1==01, 1 -> o1>o2, -1 -> o1<o2
            }
        };

        System.out.println("Result of the normal comparator is:: "+ comparator.compare(3,2));


        /**
         * Using Lambda
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of Lambda Comparator is:: "+comparatorLambda.compare(2,2));

        Comparator<Integer> comparatorLambdaTypeCast = ( a,b) -> a.compareTo(b);
        System.out.println("Result of Lambda Comparator type cast is:: "+comparatorLambda.compare(2,4));

    }


}
