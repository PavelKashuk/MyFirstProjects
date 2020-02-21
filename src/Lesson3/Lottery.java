package Lesson3;
import java.util.Scanner;
import java.util.Random;
//public class Lottery {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество участников : ");
//        int count = scanner.nextInt();
//        int winner = 1 + (int)(Math.random()*count);
//        System.out.println("Победитель под номером: " + winner) ;
//        System.out.println("Поздравляем вас, игрок под номером " + winner + "!");
//    }
//}

 public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество участников : ");
        int count = scanner.nextInt();
        int winner = randomValue(count);
        System.out.println("Победитель под номером: " + winner) ;
        System.out.println("Поздравляем вас, игрок под номером " + winner + "!");
    }
    public static int randomValue (int count) {
        Random random = new Random();
        int winner = 1 + random.nextInt(count);
        return winner;
    }
}






