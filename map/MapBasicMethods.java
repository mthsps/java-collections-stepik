package map;

import java.util.HashMap;
import java.util.Map;

public class MapBasicMethods {
    /*
    Modify and return the given map as follows: if the key "a" has a value,
    set the key "b" to have that same value. In all cases remove the key "c",
    leaving the rest of the map unchanged.
    */

    public static void main(String[] args) {

        Map<String, String> input = new HashMap<>(Map.of(
                "a", "abstraction",
                "b", "boolean",
                "c", "xyz"));


        if (input.get("a") != null) {
            input.replace("b", input.get("a"));
        }
        input.remove("c");

        System.out.println(input);
    }
}

