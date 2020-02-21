package Lesson4;
import java.util.Arrays;
import java.util.Scanner;
public class MethodTest {

//    Написать функцию, которая принимает в качестве аргументов
//    одну строку X, целое число Y и число с плавающей точкой Z и
//    возвращает как результат строку в виде
//    S = x + y + z.

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Your string: ");
//            String x = scanner.nextLine();
//
//            System.out.println("Your integer: ");
//            int y = scanner.nextInt();
//
//            System.out.println("Your double: ");
//            double z = scanner.nextDouble();
//
//            System.out.println("Result: \n" + fnc(x, y, z));
//        }
//
//        public static String fnc(String x, int y, double z) {
//            return x + y + z;
//        }
//    }

//        Написать функцию, которая принимает массив чисел в качестве
//        аргумента, увеличивает его первые 3 элемента на 1 и
//        возвращает их сумму как результат. После изменения массив и
//        сумму надо вывести на экран.

//    public static void main(String[] args) {
//        int[] arr = {10, 15, 2, 0, -6, 5, -2, 36, 69, 25};
//        System.out.println("Array before changing: " + Arrays.toString(arr) + "\n");
//        int sm = sumThree(arr);
//        System.out.println("Array after changing: " + Arrays.toString(arr) + "\n");
//        System.out.println("Sum of first 3 elements in changed array: " + sm + "\n");
//    }
//
//    static int sumThree(int[] a) {
//        int sum = 0;
//        for(int i = 0; i<=2; i++) {
//            sum += (a[i] += 1);
//        }
//        return sum;
//    }
//}

//          Написать ф-ю для объединения 2-х массивов в один. Вывести
//          результат на консоль.

//    public static void main(String[] args) {
//        int[] a = {38, 25, 11, 0, -8, -2, 11, 25, 222, 355};
//        int[] b = {325, 325, 625, 625, 400, 300, 200, 100};
//
//        System.out.println("Array [a]: " + Arrays.toString(a));
//        System.out.println("Array [b]: " + Arrays.toString(b));
//        System.out.println("Array [a] with array [b]: " + Arrays.toString(fncConc(a, b)));
//    }
//
//    static int[] fncConc(int[] a, int[] b) {
//        int len = a.length + b.length;
//        int[] arr = new int[len];
//        boolean bl = true;
//        for(int i = 0, j = 0; i < len; i++, j++) {
//            if(bl) {
//                arr[i] = a[j];
//                if(j == a.length-1) {
//                    j = -1;
//                    bl = false;
//                }
//            } else {
//                arr[i] = b[j];
//            }
//        }
//        return arr;
//    }
}






