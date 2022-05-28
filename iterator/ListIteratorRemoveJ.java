package iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListIteratorRemoveJ {
    /*
    Given string as "JButton Button JMenu..." to stdin of your program
    1. Add all elements from this string to List<String>;
    2. Next, using ListIterator remove all items not starting with J and
            items beginning with J replace with the same elements but without the J
    3. Next, print all the remaining elements in reverse order(using .println())
     */

    public static void main(String[] args) throws IOException { // Sample input: ImageButton JTextField JTextArea CheckBox JMenu
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String tempString = listIterator.next();
            if (tempString.startsWith("J")) {
                listIterator.set(tempString.replace("J",""));
            } else {
                listIterator.remove();
            }
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}
