package Lesson9;

class Dog extends Animal {

    private Dog() {
    }
    public static Dog createDog() {
        System.out.println("Опачау");
        return new Dog();
    }
    @Override
    public void voice() {
        System.out.println("Гав-гав! ");
    }
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Мясо")) {
            System.out.println("Пёс довольно виляет хвостом и ест мясо.");
        } else
            System.out.println("Пёс грустно смотрит на " + food + " и ждет косточку.");
    }
}
