package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int sum = mathOperation.sum(7, 8);

        MathOperation mathOperation1 = new MathOperation();
        int sub = mathOperation.sub(13, 5);

        double d = MathOperation.mult(6,2);
        double c = MathOperation.div(18.7 ,4);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(MathOperation.mult(5,10));
        System.out.println(MathOperation.div(50,5));
        System.out.println(d);
        System.out.println(c);
    }
}
