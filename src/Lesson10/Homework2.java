package Lesson10;

class Address implements Cloneable {
    String city;
    Address(String city) { this.city = city; }
}
class User implements Cloneable {
    int id;
    String name;
    Address address;
    User(int id, String name, Address address) {
        this.id = id; this.name = name; this.address = address;
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
    public User deepClone() {
        return new User(this.id, this.name, new Address(this.address.city));
    }
}
public class Homework2 {
    public static void main(String[] args) throws Exception {
        User original = new User(1, "Arsen", new Address("Minsk"));
        String type = "deep";
        User clone;
        if (type.equals("shallow"))
            clone = original.clone();
         else
            clone = original.deepClone();

        clone.address.city = "Vitebsk";
        System.out.println("Оригинал: " + original.address.city);
        System.out.println("Клон: " + clone.address.city);

    }
}

