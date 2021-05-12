package core.java8.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceSimple {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("piyush");
    }
}
