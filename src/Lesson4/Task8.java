package Lesson4;
import java.util.Arrays;
//public class Task8 {
//    public static void main(String[] args) {
//        int array[] = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array[i] + " - нечетное число");
//            } else {
//                    System.out.println(array[i] + " - четное число");
//                }
//            }
//        }
//    }


public class Task8 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("\"{"+array[i]+"}" + " - это число не четное\" ");
            } else if (i % 2 != 0){
                System.out.println("\"{"+array[i]+"}" + " - это четное число\" ");
            }
        }
    }
}

//public class Task8 {
//    public static void main(String[] args) {
//        int array[] = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array[i] + " - это нечетное число");
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                System.out.println(array[i] + " - это четное число");
//            }
//
//        }
//    }
//}

