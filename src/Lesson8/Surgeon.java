package Lesson8;

public class Surgeon extends Doctor {
    @Override
    public void heal() {
        System.out.println("Оперирую!");
        System.out.println("\n");
    }
}