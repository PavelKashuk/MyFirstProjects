package Lesson4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Array length equals: " + array.length);
        System.out.println("Enter any " + length + " numbers:");
        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int x = array[0];
        int y = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= x) {
                x= array[i];
            }
            if(array[i] <= y)
                y = array[i];
        }
        System.out.println("Minimum value is: " +y);
    }
}


