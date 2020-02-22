package Lesson4;

//import java.util.Arrays;
//  /*
//  1. Вывести на экран числа от 1 до 10 используя while.
//
//        Пример: 1 2 3 4 5 6 7 8 9 10
//
//        Реализовать в отдельном методе.
//     */
//
//public class Main {
//    public static void main(String[] args) {
//        whileExample();
//    }
//
//    public static void whileExample() {
//        int i = 1;
//
//        while (i<=10) {
//            System.out.print(i + " ");
//            i++;
//        }
//    }
//}
//      /*
//      2. Вывести на экран числа от 1 до 10 используя for.
//
//        Пример: 1 2 3 4 5 6 7 8 9 10
//
//        Реализовать в отдельном методе.
//        */
//
//public class MainSecond {
//    public static void main(String[] args) {
//        forExample();
//    }
//
//    private static void forExample() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//    }
//}
//    /*
//3. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
//
//        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
//
//        Реализовать в отдельном методе.
//         */
//public class Main {
//    public static void main(String[] args) {
//        whileExampleSecond();
//    }
//    public static void whileExampleSecond() {
//        int i = 100;
//
//        while (i >= 0) {
//            System.out.print(i + " ");
//            i-= 10;
//        }
//    }
//}
//
//   /*
//4. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
//
//        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
//
//        Реализовать в отдельном методе.
//       */
//public class MainSecond {
//    public static void main(String[] args) {
//        forExampleSecond();
//    }
//
//    private static void forExampleSecond() {
//        for (int i = 100; i >= 0; i-=10) {
//            System.out.print(i + " ");
//        }
//    }
//}
//
//     /*
//5. Дано 10 чисел (возможно массив). Напечатайте наибольшее из них в консоль,
//        используя циклические и условные операторы.
//
///////Первый вариант
//
//     */
//        import java.util.Arrays;
//        import java.util.Random;
//public class MainThird {
//    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println("Массив с числами");
//        int[] array = new int[10];
//        for (int i = 0; i < 10 ; i++) {
//            array[i] = random.nextInt(100)+1;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Максимальное значение: " +x);
//    }
//}
//   /*
////////////Второй вариант
//    */
//import java.util.Scanner;
//        import java.util.Arrays;
//        import java.util.Random;
//public class MainThird {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int length = scanner.nextInt();
//        Random random = new Random();
//        int[] array = new int[length];
//        System.out.println("Array length equals: " + array.length);
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = random.nextInt(1000)+1;
//        }
//        System.out.println(Arrays.toString(array));
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Maximum value is: " +x);
//    }
//}
//    /*
/////// Третий вариант
//     */
//
//import java.util.Scanner;
//        import java.util.Arrays;
//        import java.util.Random;
//public class Task6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//        System.out.println("Array length equals: " + array.length);
//        System.out.println("Enter any " + length + " numbers:");
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length ; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Maximum value is: " +x);
//    }
//}
//
//    /*
//6. Дано 10 чисел (возможно массив). Напечатайте наименьшее из них в консоль,
//        используя циклические и условные операторы.
//
//////////Первый вариант
//     */
//
//        import java.util.Arrays;
//        import java.util.Random;
//public class MainThird {
//    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println("Массив с числами");
//        int[] array = new int[10];
//        for (int i = 0; i < 10 ; i++) {
//            array[i] = random.nextInt(100)+1;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Минимальное значение: " +y);
//    }
//}
//
//     /*
///////////////Второй вариант
//    */
//import java.util.Scanner;
//        import java.util.Arrays;
//        import java.util.Random;
//public class MainThird {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int length = scanner.nextInt();
//        Random random = new Random();
//        int[] array = new int[length];
//        System.out.println("Array length equals: " + array.length);
//        for (int i = 0; i < array.length ; i++) {
//            array[i] = random.nextInt(1000)+1;
//        }
//        System.out.println(Arrays.toString(array));
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Minimum value is: " +y);
//    }
//}
//
//    /*
/////// Третий вариант
//    */
//
//import java.util.Scanner;
//        import java.util.Arrays;
//        import java.util.Random;
//public class Task6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//        System.out.println("Array length equals: " + array.length);
//        System.out.println("Enter any " + length + " numbers:");
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length ; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int x = array[0];
//        int y = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] >= x) {
//                x= array[i];
//            }
//            if(array[i] <= y)
//                y = array[i];
//        }
//        System.out.println("Minimum value is: " +y);
//    }
//}
//
//    /*
//7. Создайте переменную равную 5. Используя один из циклических оператор, напечатайте “Hillel the Best”
//        пока созданная переменная меньше 0. Текст необходимо чтобы вывелся только один раз.
//    */
//public class Main {
//    public static void main(String[] args) {
//        int i = 5;
//        do {
//            System.out.println("Hillel the Best");
//        }while (i<0);
//    }
//}
//
//     /*
//8. Создайте массив из 10 чисел от 1 до 10. В одном из циклических операторов пройдетесь по нему
//        и выведете следующие сообщения:
//
//        о Если четное - “{число} - это четно число”
//
//        о Если не четное - “{число} - это число не четное”
//
//        Пример:
//
//        1 - не четное число
//
//        2- четное число
//
//        3 - не четное число
//
//        ...
//
//    */
//        import java.util.Arrays;
//public class Task8 {
//    public static void main(String[] args) {
//        int array[] = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array[i] + " - не четное число");
//            } else {
//                System.out.println(array[i] + " - четное число");
//            }
//        }
//    }
//}
//
////////////////////////
//
//
//public class Task8 {
//    public static void main(String[] args) {
//        int array[] = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println("\"{"+array[i]+"}" + " - это число не четное\" ");
//            } else if (i % 2 != 0){
//                System.out.println("\"{"+array[i]+"}" + " - это четное число\" ");
//            }
//        }
//    }
//}

