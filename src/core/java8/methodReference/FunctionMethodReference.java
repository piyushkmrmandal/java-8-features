package core.java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> function = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(function.apply("piyush"));
    }
}
