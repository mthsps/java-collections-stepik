package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("its", "no", "long", "string");

        strings.stream()
                .filter(n -> n.length() < 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


}
