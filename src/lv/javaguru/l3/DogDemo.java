package lv.javaguru.l3;

/**
 * @author Konstantins Buts on 2019-10-08.
 */
public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 6);

        dog.bark();
        dog.sleep();

        dog.age = 7;

        dog.sleep();

    }

}
