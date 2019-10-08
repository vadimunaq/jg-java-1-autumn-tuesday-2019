package lv.javaguru.l3;

/**
 * @author Konstantins Buts on 2019-10-08.
 */
public class Dog {

    String name;
    int age;

    Dog() {

    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    void bark() {
        System.out.println("Woof Woof! I am " + name);
    }

    void sleep() {
        System.out.println("So nice to sleep!");
        System.out.println("I've been sleeping for the last " + age + " years");
    }

}
