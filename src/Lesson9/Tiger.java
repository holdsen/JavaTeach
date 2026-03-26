package Lesson9;
class Tiger extends Animal {
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Мясо"))
            System.out.println("Тигр подошёл понюхал и радостно взялся за лакомство");
        else if (food.equalsIgnoreCase("Трава"))
            System.out.println("Он лишь подошёл посмотрел на тебя и потом обратно пошел лёг");
         else
            System.out.println("Тигр такое не есть!");
    }
    @Override
    public void voice() {
        System.out.println("РРРРРРР!!!\uD83E\uDD8A");
    }
}