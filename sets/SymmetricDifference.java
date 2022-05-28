package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SymmetricDifference {
    // https://en.wikipedia.org/wiki/Symmetric_difference
    // 1.Find Symmetrical difference of sets on symDifference(Set<T> set1, Set<T> set2) and return it.
    // For example: sets: {1 2 3 4}, {3 4 5 6} --> Symmetrical difference = {1 2 5 6}

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 14, 16, 5, 13, 2, 20, 10, 6, 9));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));

        Set<Integer> symmetricalDiff = new HashSet<>();

        for (Integer integer: set1) {
            if (!set2.contains(integer))
                symmetricalDiff.add(integer);
            for (Integer item: set2 ) {
                if (!set1.contains(item))
                    symmetricalDiff.add(item);
            }
        }

        // Alternative solution using Stream
        Set<Integer> symmetricalDiff2 = Stream.concat(set1.stream(), set2.stream())
                .filter(n -> !(set1.contains(n) && set2.contains(n)))
                .collect(Collectors.toSet());

        symmetricalDiff.forEach(System.out::println);
        symmetricalDiff2.forEach(System.out::println);
    }
}