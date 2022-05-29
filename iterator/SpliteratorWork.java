package iterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpliteratorWork {
/*
    1. On spliteratorWork( List<Double> lst ):
            -using Spliterator add to List<Double> sqrts all square roots of items from lst, if this item greater than 1
            -use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
    2. On print(List<Double> list):
            -get spliterator() of given list
            -divide spliterator into 2 parts ( use spliterator.trySplit())
            -print all items which >=2 from first part (use .println())
            -print empty string
            -print all items which >=10 from second part (use .println())
 */

    public static void main(String[] args) {
        List<Double> sqrs = new ArrayList<>();
        List<Double> lst = Stream.of(1,4,8,16,99,100,110,121).map(Double::valueOf).collect(Collectors.toList());

        Spliterator<Double> spliterator = lst.spliterator();

        spliterator.forEachRemaining(n -> {
            if (n > 1)
                sqrs.add(Math.sqrt(n));
        });

        print(sqrs);
    }


    public static void print(List<Double> list){
        Spliterator<Double> spliterator = list.spliterator();

       spliterator.trySplit().forEachRemaining(n -> {
           if (n >= 2) {
               System.out.println(n);
           }
       });

       System.out.println();

        spliterator.forEachRemaining(n -> {
            if (n >= 10) {
                System.out.println(n);
            }
        });

    }
}
