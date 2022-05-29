package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapWordCount {
    /*
    Given an array of strings, on wordCount() return a SortedMap<String, Integer>
    with a key for each different string, with the value the number of times
    that string appears in the array.
     */

    public static void main(String[] args) {
        String[] input = {"a", "b", "b", "c", "d", "a", "b", "b", "e", "e"};
        SortedMap<String, Integer> wordCount = new TreeMap<>();

        for (String item : input) {
            wordCount.merge(item,1, (k, v) -> (k + 1));
        }

        wordCount.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
