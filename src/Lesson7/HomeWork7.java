package Lesson7;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;


/**
 * Author Shaternik Arsen
 * Made by Shaternik Mikita Miroslavovich
 */


public class HomeWork7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

/*
 * чтобы было Просто
 */
        System.out.println("Выбери какую задачу тебе надо");
        System.out.println("1 - Задача 1");
        System.out.println("2 - Задача 2");
        System.out.println("3 - Задача со звёздочкой");
        System.out.println("Пиши здесь: ");
        byte start = scanner.nextByte();


        if (start == 1)
            TaskOne.run();
         else if (start == 2)
            TaskTwo.run();
         else if (start == 3)
            TaskThree.run();
         else
            System.out.println("Напиши Доступное число");

    }


    public class TaskOne {
        static class Director implements PrintThere {
            @Override
            public void printThere() {
                System.out.println("Директор!");
            }
        }

        static class Worker implements PrintThere {
            @Override
            public void printThere() {
                System.out.println("Рабочий!");
            }
        }

        static class Byhgalter implements PrintThere {
            @Override
            public void printThere() {
                System.out.println("Бухгалтер!");
            }

        }
        public static void run() {

        Director director = new Director();
        Worker worker = new Worker();
            Byhgalter byhgalter = new Byhgalter();
            director.printThere();
        worker.printThere();
        byhgalter.printThere();

    }
        }
    public class TaskTwo {
        abstract static class Figure {
            public abstract double getArea();

            public abstract double getPerimetr();
        }

        static class Triangle extends Figure {
            double a, b, c;
            Triangle(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            @Override
            public double getPerimetr() {
                return a + b + c;
            }
            @Override
            public double getArea() {
                double p = getPerimetr() / 2;
                return Math.sqrt(p * (p - a) * (p - b) * (p - c));

            }
        }

        static class Rectangle extends Figure {
            double width, height;

            Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            @Override
            public double getPerimetr() {
                return 2 * (width + height);
            }

            @Override
            public double getArea() {
                return width * height;
            }
        }

        static class Circle extends Figure {
            double radius;

            Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double getPerimetr() {
                return 2 * Math.PI * radius;
            }

            @Override
            public double getArea() {
                return Math.PI * Math.pow(radius, 2);
            }
        }
        public static void run() {
            Figure[] figures = new Figure[5];
            figures[0] = new Triangle(3, 4, 5);
            figures[1] = new Rectangle(10,20);
            figures[2] = new Circle(7);
            figures[3] = new Rectangle(5,5);
            figures[4] = new Circle(3);

            double totalPerimetr = 0;

            System.out.println("фигуры и их параметры \n");
            for (Figure f : figures) {
                double p = f.getPerimetr();
                double s = f.getArea();
                System.out.printf("%s: Периметр = %.2f, Площадь = %.2f\n",
                        f.getClass().getSimpleName(), p, s);
                totalPerimetr += p;
            }
            System.out.printf("Сумма периметров всех фигур: %.2f\n", totalPerimetr);
        }
    }


    public static class TaskThree {

        static class Person implements Cloneable {
            String name;

            Person(String name) {
                this.name = name;
            }


            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        public static void run() {
            try {

                Person original = new Person("Арсээээн");


                Person copy = (Person) original.clone();


                System.out.println("Оригинал: " + original.name);
                System.out.println("Копия: " + copy.name);


                if (original != copy) {
                    System.out.println("Успех: Это два РАЗНЫХ объекта с одинаковыми данными!");
                }

            } catch (CloneNotSupportedException e) {

                System.out.println("Ошибка: Клонирование не поддерживается.");
            }
            System.out.println("Короче cloneable это от слово clone, и он что-то клонирует точно я не понял зачем это но понял)");
        }


    }

    public interface PrintThere {
        void printThere();
    }
}
