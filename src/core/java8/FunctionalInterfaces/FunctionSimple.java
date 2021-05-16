package core.java8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionSimple {

    private static Function<String, String> function = (name) -> name.toUpperCase();

    private static Function<String, String> functionConcat = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println(function.apply("java8"));
        System.out.println("Result of andThen is : "+function.andThen(functionConcat).apply("java"));
        System.out.println("Result of compose is : "+function.compose(functionConcat).apply("java"));

    }
}
