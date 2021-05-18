package core.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkip {

    public static Optional<Integer> sumLimit(List<Integer> list){
        return list.stream()
                .limit(2) //limits the stream upto 2 elements
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skipSum(List<Integer> list){
        return list.stream()
                .skip(3) // skips the first 3 elements of the stream
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        List<Integer> emptyList = new ArrayList<>();

        Optional<Integer> sumResult = sumLimit(list);
        if(sumResult.isPresent())
            System.out.println("Sum is:"+sumResult.get());
        else
            System.out.println("List is empty..");

        Optional<Integer> skipResult = skipSum(list);
        if(skipResult.isPresent())
            System.out.println("Sum is:"+skipResult.get());
        else
            System.out.println("List is empty..");

    }
}
