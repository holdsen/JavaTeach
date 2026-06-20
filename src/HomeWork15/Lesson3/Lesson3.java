package HomeWork15.Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Артём", "А-1", 2, Arrays.asList(5, 4, 3, 5)));
        students.add(new Student("Арсений", "Б-2", 1, Arrays.asList(4, 3, 3, 4)));
        students.add(new Student("Никита", "А-1", 2, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student("Дмитрий", "В-3", 3, Arrays.asList(3, 3, 2, 3)));
        System.out.println("Список до обработки:");
        students.forEach(System.out::println);
        processStudents(students);
        System.out.println("\nСписок после обработки (удаление/повышение):");
        students.forEach(System.out::println);
        System.out.println("\nСтуденты на 3 курсе:");
        printStudents(students, 3);
    }
    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator(); // често я хз как надо было, AI сказал так я и сделал, вроде бы работает
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.promote();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("- " + s.getName());
            }
        }
    }
}