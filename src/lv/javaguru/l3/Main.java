package lv.javaguru.l3;

/**
 * @author Konstantins Buts on 2019-10-08.
 */
public class Main {

    public static void main(String[] args) {

        sayHi();
        greet();
        sayHi();

//        greet();
//
//        int sumResult = sum(3, 5, 7);
//
//        System.out.println("sumResult = " + sumResult);

    }

    public static void sayHi() {
        System.out.println("Hi!");
    }

    public static void greet() {
        System.out.println("Hello World!");
        System.out.println("It is a nice weather today!");

        int square = sqr(7);

        System.out.println("Square = " + square);

    }

    public static int sqr(int x) {
        int result = x * x;
        return result;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
