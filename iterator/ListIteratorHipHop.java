package iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListIteratorHipHop {
    /*
    1.Using ListIterator iterate over the elements of list
               from the beginning to the end and after each word "Hip" add "Hop"
    2.Using ListIterator print the all elements(using .println())
     */
    public static void main(String[] args) throws IOException { // Sample input: Iterator Hip Hoi Hap Iterator Hip Hi
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            if (Objects.equals(listIterator.next(), "Hip")) {
                listIterator.add("Hop");
            }
        }

        list.forEach(System.out::println);
    }
}
