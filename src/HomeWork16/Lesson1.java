package HomeWork16;

import java.util.HashMap;
import java.util.Map;

public class Lesson1 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println("Урок первый");
        String[] symbols = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> result = wordMultiple(symbols);
        System.out.println(result);
    }
}