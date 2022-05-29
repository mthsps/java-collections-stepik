package map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapGetSubMap {

    /*
    Modify and return the given map as follows:
     If the first key % 2 != 0 return sub map from First Key inclusive to FirstKey+4 inclusive in descending order
     Else return sub map from LastKey-4 inclusive to the Last Key inclusive in descending order
    */

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>(Map.of(
                1,"one",
                2,"two",
                3,"three",
                4,"four",
                5,"five",
                6,"six",
                7,"seven"));

        int firstKey = map.firstKey();
        if (firstKey % 2 != 0) {
            map.subMap(firstKey,true, firstKey+4,true)
                    .descendingMap();
        } else {
            int lastKey = map.lastKey();
            map.subMap(lastKey-4,true, lastKey,true)
                    .descendingMap();
        }
    }
}
