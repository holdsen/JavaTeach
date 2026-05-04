package HomeWork18;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Домашнее задание №18
 * Данный класс содержит комплексное решение задач по теме Data API.
 * Основные темы:

 *   - Optional
 *   - Stream API
 *   - Stream и их свойства

 * @author Arsen Shaternik ★
 * @author inspector Nikita Shaternik ★
 * @version New
 * @see java.util.Arrays
 * @since 03.05.2026

 * Стримы и optional
 **/
public class Lesson1 {
    public final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1 урок");
        List<Integer> arrays = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,5,6));
        int sum = arrays.stream().filter(n -> n % 2 == 0).distinct().mapToInt(n -> n).sum();
        System.out.println("Сумма: " + sum);
        Lesson2();
    }
    public static void Lesson2() {
    Map<Integer,String> users = Map.ofEntries(
            Map.entry(1, "Микита"),
            Map.entry(2, "Друн"),
            Map.entry(3, "Чёрный друн"),
            Map.entry(4, "Александр"),
            Map.entry(5, "Богдан"),
            Map.entry(6, "Артур"),
            Map.entry(7, "Фог"),
            Map.entry(8, "Раис"),
            Map.entry(9, "Рамштаин"),
            Map.entry(10, "Моргенштерн"),
            Map.entry(11, "Михаил"),
            Map.entry(12, "Чёрный принц"),
            Map.entry(13, "Алексей"),
            Map.entry(14, "Никитосик")
    );
    Set<Integer> mandatoryID = Set.of(1,2,5,8,9,13);
    List<String> completion = users.entrySet().stream()
            .filter(entry -> mandatoryID.contains(entry.getKey()))
            .filter(entry -> entry.getValue().length() % 2 != 0)
            .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
            .collect(Collectors.toList());
        System.out.println(completion);
    }
}
