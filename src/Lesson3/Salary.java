package Lesson3;
import java.lang.Math;
import java.util.Random;
/*
5. Создать 2 схожих метода, которые будут случайным образом генерировать Вашу зарплату.
Обратите внимание, что именно метода, а не просто вызовы указанных функций.
В одном методе используйте класс Random, в другом Math.random. Для себя поймите разницу в использовании.
Если не хотите получать маленькую зарплату, то можете выполнить дополнительные действия с Math.random)

 */

public class Salary {
   public static void main(String[] args) {
       System.out.println(getSalaryFirst());
       System.out.println(getSalarySecond());
   }

   public static  int getSalaryFirst() {
       int amount1;
        amount1 = 1 + (int) (Math.random() * 10000);
       return amount1;

 }
 public static double getSalarySecond() {
     Random random = new Random();
     double amount2;
      amount2 = 1+random.nextDouble() * (20000) ;
     return amount2;
 }
 }