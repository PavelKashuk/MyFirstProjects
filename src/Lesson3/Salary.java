package Lesson3;
import java.lang.Math;
import java.util.Random;


public class Salary {
   public static void main(String[] args) {
       System.out.println(getSalaryFirst());
       System.out.println(getSalarySecond());
   }

   public static  int getSalaryFirst() {
 int amount1 = 1 + (int) (Math.random() * 10000);
       return amount1;

 }
 public static double getSalarySecond() {
     Random random = new Random();
     double amount2 = 1+random.nextDouble() * (20000) ;
     return amount2;
 }
 }