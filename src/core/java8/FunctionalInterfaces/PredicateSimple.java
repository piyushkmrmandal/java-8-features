package core.java8.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateSimple {

    private static Predicate<Integer> p = (i) -> i%2==0;
    private static  Predicate<Integer> p1=(i) -> i%5==0;

    public static void simplePredicate(){
        System.out.println("Simple Predicate result:: "+p.test(4));
    }

    public static void predicateAnd(){
        System.out.println("And method of Predicate result:: "+p.and(p1).test(10));
        System.out.println("And method of Predicate result:: "+p.and(p1).test(6));
    }

    public static void predicateOr(){
        System.out.println("And method of Predicate result:: "+p.or(p1).test(10));
        System.out.println("And method of Predicate result:: "+p.or(p1).test(6));
    }

    public static void predicateNegate(){
        System.out.println("And method of Negate result:: "+p.or(p1).negate().test(10));
        System.out.println("And method of Negate result:: "+p.and(p1).negate().test(6));
    }

    public static void main(String[] args) {

        simplePredicate();
        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
