package lv.javaguru.l2;

import java.util.Random;

public class RandomNumberExample {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        System.out.println("Result = " + randomNumber1);
        System.out.println("Result = " + randomNumber2);
    }

}
