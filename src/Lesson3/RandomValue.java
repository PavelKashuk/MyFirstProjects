package Lesson3;

import java.util.Random;

public class RandomValue {
    public static void main(String[] args) {
      Random random = new Random();
      int first = random.nextInt();
      int second = random.nextInt();
      int third = random.nextInt();
      double firstD = random.nextDouble();
      double secondD = random.nextDouble();
      double thirdD = random.nextDouble();
      String str = String.valueOf(first + second + third + firstD + secondD + thirdD);
      System.out.println(str);

    }
}
