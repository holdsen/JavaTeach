package Lesson10;

import java.util.Objects;

/**
 * 1 задание
 * 2 задание в homework2
 */

class UserName {
    String name;

    UserName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class HomeWork10 {
    public static void main(String[] args) {
        UserName u1 = new UserName("Mikita");
        UserName u2 = new UserName("Mikita");

        System.out.println(u1);
        System.out.println("Равны: " + u1.equals(u2));
    }
}