package Lesson9;
class DogLessonOne extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Мясо"))
            System.out.println("Собака подошла понюхала и радостно взялась за лакомство");
        else if (food.equalsIgnoreCase("Трава"))
            System.out.println("Собака посмотрела на тебя и ушла");
        else
            System.out.println("Собаке такое не нравиться!");
    }
    @Override
    public void voice() {
        System.out.println("Гав - ГАв!");
    }
}