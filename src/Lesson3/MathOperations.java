package Lesson3;
import java.lang.Math;

public class MathOperations {
    public static void main(String[] args) {
        double res1 = Math.abs(-13.5);
        double res2 = Math.cbrt(27);
        double res3 = Math.sqrt(16);
        double res4 = Math.ceil(2.34);
        double res5 = Math.floor(2.56);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.random()*10);
    }
}
