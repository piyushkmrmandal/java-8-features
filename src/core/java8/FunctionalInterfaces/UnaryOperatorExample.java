package core.java8.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    private static UnaryOperator<String> unaryOperator = (str) -> str.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java"));
    }
}
