package core.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullable {

    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable("Hello");//if null passed it will return Optional.empty instead of NPE
        return stringOptional;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("Hello");//if null passed it will throw NullPointerException
        return stringOptional;
    }

    public static Optional<String> empty(){
        return Optional.empty();//return empty object as a result
    }

    public static void main(String[] args) {
        System.out.println("OfNullable : " + ofNullable().get());
        System.out.println("Of : " + of().get());
        System.out.println("Empty : "+empty());
    }
}
