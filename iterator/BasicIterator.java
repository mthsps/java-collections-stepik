package iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicIterator {

    /*
    1. Using BufferedReader read one string with numbers written across the space ("1 2 3 4 5 ...").
    2. Put these numbers in any Collection of Integers.
    3. Sort this collection.
    4. Using Iterator remove all even numbers from your collection.
    5. Print all remaining elements to console (use System.out.println() method)
     */



    public static void main(String[] args) throws IOException { // Sample input: 1 2 3 4 5 6 7 8 9 10
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::valueOf).sorted().collect(Collectors.toList());


        // Would be simpler: list.removeIf(value -> value % 2 == 0);
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }
        }

        list.forEach(System.out::println);

    }
}
