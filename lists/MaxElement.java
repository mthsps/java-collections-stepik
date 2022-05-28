package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElement {
    // You need to find the max element in the collection
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(847,271,663,473,376,133,693,13,382,879);
        int max = 0;

        for (Integer item: list) {
            if (item > max) {
                max = item;
            }
        }
        System.out.println(max);

        //Alternative simpler solution:
        System.out.println(Collections.max(list));
    }
}
