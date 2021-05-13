package core.java8.FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSimple {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is: "+(a*b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is: "+(a/b));

        multiply.andThen(division).accept(10,5);
    }
}
