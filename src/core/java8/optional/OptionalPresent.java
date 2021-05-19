package core.java8.optional;

import java.util.Optional;

public class OptionalPresent {

    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("Hello Optional");
        System.out.println(optional.isPresent());
        if(optional.isPresent())
            System.out.println(optional.get());

        //ifPresent - it accepts a consumer
        optional.ifPresent((s)->System.out.println(s));
    }
}