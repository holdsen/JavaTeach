package HomeWork14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedMap;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Урок 1");
        String start = "";
        try (BufferedReader romeoAndJulieta = new BufferedReader(new FileReader("D:\\JavaTeach\\src\\HomeWork14\\Romeo And Julieta.txt"));
             FileWriter writer = new FileWriter("D:\\JavaTeach\\src\\HomeWork14\\BigWrites.txt")) {
            String line;
            while((line = romeoAndJulieta.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String cleanword = word.replace("[^a-zA-Zа-яА-Я]", "");
                    if(cleanword.length() > start.length()) {
                        start = cleanword;
                    }
                }
            }
            writer.write("Самое длинное!: " + start);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\JavaTeach\\src\\HomeWork14\\BigWrites.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
