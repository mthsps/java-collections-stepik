package lists;

import java.util.*;

public class ChangeList {
    /*
    1. Find the longest string in list
     2. Replace all list items with this row
     3. Return modified list
     */
    public static void main(String[] args) {
        String input = "hi hello goodmorning ace";
        List<String> list = new ArrayList<>();
        list = Arrays.asList(input.split(" "));

        String longestString = "";

        for (String item : list) {
            if (item.length() > longestString.length()) {
                longestString = item;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, longestString);
        }

        System.out.println(list);

    }


}
