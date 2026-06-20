package HomeWork16;
import java.util.Map;
import java.util.HashMap;
public class Lesson2 {
    public static Map<String, String> before(String[] strings) {
    Map<String, String> map =  new HashMap<>();
    for (String s : strings) {
        String first = s.substring(0,1);
        String last = s.substring(s.length() - 1);
        map.put(first,last);
    }
        return map;
    }

    public static void main(String[] args) {
        System.out.println("Урок 2");
String[] data = {"code", "bruh"};
        System.out.println("Изи вот держи: ");
        System.out.print(before(data));


    }
}
