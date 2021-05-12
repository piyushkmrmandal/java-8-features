package core.java8.imperativeDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarative2 {
    public static void main(String[] args) {

        /**
         * To remove duplicate numbers form a list
         */

        List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6,7,8,8,9,5,10);
        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        long startTime = System.nanoTime();
        for(Integer i:list){
            if(!uniqueList.contains(i))
                uniqueList.add(i);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        System.out.println("Time taken::"+totalTime);
        System.out.println("Imperative approach::"+uniqueList);

        /**
         * Declarative
         */
        long startTimeD = System.nanoTime();
        List<Integer> uniqueListD = list.stream()
                .distinct()
                .collect(Collectors.toList());
        long endTimeD = System.nanoTime();
        long totalTimeD = endTimeD-startTimeD;
        System.out.println("Time taken::"+totalTimeD);
        System.out.println("Declarative approach::"+uniqueListD);
    }
}
