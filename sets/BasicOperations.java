package sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicOperations {
    /*
    1.Given a string as "1 2 3 4 5 6 ..." . String[] strings contains of element from given string ("1","2",..).
    2.Add all elements from String[] strings to Set<Integer> set.
    3.Using Iterator remove/filter(Stream API)/"method-of-all-collections"
                                all elements greater than 10(>) from set and return modified set.
     */

    public static void main(String[] args) throws IOException { // Sample input: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");

        //add elements from strings to set
        Set<Integer> set = Arrays.stream(strings).map(Integer::valueOf).collect(Collectors.toSet());

        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
        return set.stream().filter(n -> n <= 10).collect(Collectors.toSet());
    }

}
