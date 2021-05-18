package core.java8.streamapi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {
    public static void main(String[] args) {
        //Of method
        Stream<String> stringStream = Stream.of("Adam","Emily","Piyush");
        stringStream.forEach(System.out::println);

        //Iterate method
        Stream.iterate(1,x->x*2)
                .limit(6)
                .forEach(System.out::println);

        //Generate method
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
