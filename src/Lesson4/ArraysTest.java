package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

//public class ArraysTest {
//    Задача 1:
//            1. Задать массив целых чисел длинной 10 эл.
//            2. Отсортировать числа в массиве
//            3. Вывести на экран результат.
//            4. Сделать возможность наполнения массива с клавиатуры*.

//    public static void main(String[] args) {
//            int[] array = new int[10];
//            Scanner scanner = new Scanner(System.in);
//            int i = 0;
//            while (i<10) {
//                System.out.println("Enter " + (i+1) + " integer: ");
//                array[i] = scanner.nextInt();
//                i++;
//            }
//            Arrays.sort(array);
//            System.out.println("Your array after sorting: " + Arrays.toString(array));
//        }
//    }

//    Задача 2:
//            1. Задать массив целых чисел длинной N эл.
//            2. Поменять 1-й и последний элемент местами.
//            3. Вывести массив на экран.

//        public static void main (String[]args){
//            int[] array = {-10, 5, 15, 26, 35, 44, 58, -51, 0, 25};
//            int i = array[0];
//            array[0] = array[array.length - 1];
//            array[array.length - 1] = i;
//            System.out.println("New array is: " + Arrays.toString(array));
//        }
//    }

//    Задача 3:
//            1. Ввести с клавиатуры массив из 10 чисел.
//            2. Разбить его на 2 массива равной длинны.
//            3. Отсортировать каждую из половинок и вывести их содержимое на экран.

//

//    Задача 4:
//            1. Среднее арифметическое элементов массива.

//    public static void main(String[] args) {
//        int[] array = {125, 25, 15, 10, 53, 33, 65, 88, 95, 34, 12};
//        int i = 0, x = 0;
//        while (i<array.length) {
//            x = x + array[i];
//            i++;
//        }
//        double avg = (double)x/array.length;
//        System.out.println("The average of the array elements is: " + avg);
//    }
//}

        //- Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
//        int i = 0;
//        int[] arr1 = new int[arr.length];
//        while (i<arr.length) {
//            arr1[i] = arr[arr.length-1-i];
//            i++;
//        }
//        System.out.println("The mirror array : " + Arrays.toString(arr1));
//    }
//}

//          - Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
//           элементами, а затем выводить нужный элемент по его индексу на консоль.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int cnt, i = 0;
//        System.out.println("Enter count of elements in your integer array: ");
//        cnt = scanner.nextInt();
//        int[] array = new int[cnt];
//        System.out.println("Fill your integer array.");
//        System.out.println();
//        while (i < cnt) {
//            System.out.println("Enter " + i + " integer element in yoyr array: ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        System.out.println("Your integer array is filled!");
//        System.out.println();
//        int ind = -1;
//        while (ind < 0 || ind >= cnt) {
//            System.out.println("Enter index of element in your integer array \n"  +
//                    "(it can be only integer from 0 to " + (cnt - 1) + "): ");
//            ind = scanner.nextInt();
//        }
//        System.out.println("Value of the element №" + ind + " is: " + array[ind]);
//    }
//}


//            Заполнить массив числами от 100 до 0.
//
//        public static void main(String[] args) {
//            int[] array = new int[101];
//            int i = 100;
//            int ind = 0;
//            while (i >= 0) {
//                array[ind] = i;
//                i--;
//                ind++;
//            }
//            ind = 0;
//            System.out.print("Array: " + Arrays.toString(array));
//        }
//    }

//      Дано массив из 10 целых чисел. Вывести на экран
//       сумму всех его элементов кроме первого и
//            последнего

//public static void main(String[] args) {
//        int[] array = {15, 25, 38, 44, -10, 0, 65, 99, 250, 22};
//        int sum = 0;
//        for(int i = 1; i < array.length - 1; i++) {
//        sum = sum + array[i];
//        }
//        System.out.println("Sum is: " + sum);
//    }
//}

//           Найти в массиве чисел элементы с наибольшим и
//            наименьшим значениями.


//    public static void main(String[] args) {
//        int[] array = {0, -15, 35, 50, 12, 3, 25, 11, 8, 1, 36, -45, -46, -3, 26, 355, 86, 48, 9};
//
//        int max = array[0];
//        int min = array[0];
//
//        for(int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        System.out.println("MAX value in array: " + max);
//        System.out.println("MIN value in array: " + min);
//    }
//}


//           Написать метод, который заполнит массив
//           произвольного размера числами по возрастанию,
//            начиная с центра массива, например,
//          [5,4,3,2,1,0,1,2,3,4,5].

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter count of elements in your integer array: ");
//        int len = scanner.nextInt();
//        int[] array = new int[len];
//        int cnt = array.length/2;
//
//        if(array.length%2 == 1) {
//            array[array.length/2] = 0;
//            for (int i = 1; i <= cnt; i++) {
//                array[array.length/2 - i] = i;
//                array[array.length/2 + i] = i;
//            }
//        } else {
//            for (int i = 0; i < cnt; i++) {
//                array[array.length/2-(i+1)] = i;
//                array[array.length/2 + i] = i;
//            }
//        }
//        String sArr = Arrays.toString(array);
//        System.out.println("Your array is: " + sArr);
//    }
//}