package Lesson2;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Random;
import java.util.Arrays;
public class MultiArrayes {
    public static void main(String[] args) {
        int matrixB[][] = new int[3][];
        matrixB[0] = new int[]{1, 2, 3};
        matrixB[1] = new int[]{4, 5, 6};
        matrixB[2] = new int[]{7, 8, 9};
        System.out.println("Создать массив от 1 до 9");
        System.out.println(Arrays.toString(matrixB[0]));
        System.out.println(Arrays.toString(matrixB[1]));
        System.out.println(Arrays.toString(matrixB[2]));
        matrixB[0][0] = 9;
        matrixB[0][1] = 8;
        matrixB[0][2] = 7;
        matrixB[1][0] = 6;
        matrixB[1][1] = 5;
        matrixB[1][2] = 4;
        matrixB[2][0] = 3;
        matrixB[2][1] = 2;
        matrixB[2][2] = 1;
        System.out.println("Изменить массив с 9 до 1");
        System.out.println(Arrays.toString(matrixB[0]));
        System.out.println(Arrays.toString(matrixB[1]));
        System.out.println(Arrays.toString(matrixB[2]));
        System.out.println("Конец программы");
    }
}

//        int [][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
////        int[][] matrixA = new int[3][3];
////        matrixA[0][0] = 1;
////        matrixA[0][1] = 2;
////        matrixA[0][2] = 3;
////        matrixA[1][0] = 4;
////        matrixA[1][1] = 5;
////        matrixA[1][2] = 6;
////        matrixA[2][0] = 7;
////        matrixA[2][1] = 8;
////        matrixA[2][2] = 9;
//        System.out.println("Созданный массив");
//        for (int i = 0; i < matrixA.length; i++) {
//            for (int j = 0; j < matrixA.length; j++) {
//                System.out.print(matrixA[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Массив в обратном порядке");
//        for (int k = matrixA.length-1; k >= 0; k--) {
//            for (int h = matrixA.length-1; h >= 0; h--) {
//                System.out.print(matrixA[k][h] + "\t");
//            }
//            System.out.println();
//        }
//
//
//        }
//
//            }




