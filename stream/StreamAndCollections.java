package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndCollections {

    /*
    Given string as "JButton Button JMenu..." to stdin of your program
     1. Add all elements from this string to List<String>
     2. Next, using Stream API, remove all items not starting with J
                 and items beginning with J replace with the same elements
                 but without the J ,for example JFrame -> Frame
     3. Next, print all the remaining elements in reverse order(using .println())
     */

    public static void main(String[] args) throws IOException { // Sample input: ImageButton JTextField JTextArea CheckBox JMenu
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));

        List<String> streamedList = list.stream()
                .filter(n -> n.startsWith("J"))
                .map(n -> n.replace("J",""))
                .collect(Collectors.toList());

        Collections.reverse(streamedList);
        streamedList.forEach(System.out::println);
    }

}

