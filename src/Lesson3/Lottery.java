package Lesson3;
import java.util.Scanner;
import java.util.Random;
/*

3. Создать метод, для розыгрыша приза в лотерее среди участников.
Внутри метода сделать возможным каждый раз при вызове вводить количество участников
(При запуске программы должно спрашивать количество участников(использовать Scanner),
вы задаете количество участников и среди них производится розыгрыш).
Используя класс Random определить победителя и вывести поздравление в консоль.
У данного метода не будет принимаемых параметров и может быть,
может не быть возвращаемый параметр с результатом победителя
(зависит от того как вы реализуете).
 */
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
        int winner;
        Random random = new Random();
         winner = 1 + random.nextInt(count);
        return winner;
    }
}






