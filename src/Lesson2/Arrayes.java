package Lesson2;

import java.util.Arrays;

public class Arrayes {

    public static void main(String[] args) {
        int [] numbers = new int[10];
        numbers [0] = 15;
        numbers [1] = 19;
        numbers [2] = 27;
        numbers [3] = 23;
        numbers [4] = 31;
        numbers [5] = 36;
        numbers [6] = 43;
        numbers [7] = 50;
        numbers [8] = 56;
        numbers [9] = 61;
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers [i]);
        System.out.println( "Значения ячеек с нечетным индексом будут увеличены вдвое" );
        System.out.println( "Значения ячеек с четным индексом будут уменьшены вдвое" );
        System.out.println(numbers[0] * 2);
        System.out.println(numbers[1] * 2);
        System.out.println(numbers[2] / 2);
        System.out.println(numbers[3] * 2);
        System.out.println(numbers[4] / 2);
        System.out.println(numbers[5] * 2);
        System.out.println(numbers[6] / 2);
        System.out.println(numbers[7] * 2);
        System.out.println(numbers[8] / 2);
        System.out.println(numbers[9] * 2);
//        numbers [0] *= 2;
//        numbers [1]  *= 2;
//        numbers [2] /= 2;
//        numbers [3] *= 2;
//        numbers [4] /= 2;
//        numbers [5] *= 2;
//        numbers [6] /= 2;
//        numbers [7] *= 2;
//        numbers [8] /= 2;
//        numbers [9] *= 2;
//        for (int i = 0; i < numbers.length; i++)
//            System.out.println(numbers [i]);
    }
}