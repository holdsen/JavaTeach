package Lesson9;
class Rabbit extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Трава"))
            System.out.println("Кролик радостно взял и скушал травку!");
         else if (food.equalsIgnoreCase("Мясо"))
            System.out.println("Он понюхал мясо и убежал недовольно...");
         else
            System.out.println("Кролик Лишь пофыркал и ушел, упустил ты свой шанс.");
    }
    @Override
    public void voice() {
        System.out.println("ХРР-хррр");
    }
}