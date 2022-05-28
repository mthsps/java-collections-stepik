package sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FromSeveralToOne {

    /*
    Given one input string as "1 2 3 4 5; 6 7 8 9 10;11 12 13 14 15" (3 lists)
    1. String[] sets consists of these lists. Add all elements from each list to correct set
    2. On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
        1) In each Set, find the maximum value
        2) Create TreeSet, add the resulting elements to TreeSet
        3) Return this TreeSet with elements sorted in descending order:
    3. Using System.out.println() print elements of resultTreeSet
     */

    public static void main(String[] args) throws IOException { // Sample input: 6 11 9 18 10;12 13 19 8 16;3 4 5 15 20
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        //your code(add elements to set1 from sets[0])
        Set<Integer> set1 = Arrays.stream(sets[0].split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());

        //your code(add elements to set2 from sets[1])
        Set<Integer> set2 = Arrays.stream(sets[1].split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());

        //your code(add elements to set3 from sets[2])
        Set<Integer> set3 = Arrays.stream(sets[2].split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

        //print elements of resultTreeSet(using System.out.printLn()) below
        resultTreeSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));

        return resultSet;
    }

}
