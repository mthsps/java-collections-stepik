package lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddAndRemoveLinkedLists {
    /*
        1.Separate elements with a space from str;
        2.Add all these numbers to the head of LinkedList;
        3.Remove 3 times the element at index 0;
        4.Sort the resulting list in ascending order and print all its elements, each on a new line;
     */
    public static void main(String[] args) throws IOException { // Sample input: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        List<Integer> list = Arrays.stream(str.split(" ")).map(Integer::valueOf).toList();

        LinkedList<Integer> linkedList = new LinkedList<>(list);

        linkedList.stream().skip(3).sorted().forEach(System.out::println);
    }


}
