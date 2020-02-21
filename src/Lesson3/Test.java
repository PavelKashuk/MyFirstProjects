
package Lesson3;

import java.util.Scanner;

public class Test {
    private static Scanner s;

    public static void main(String[ ] args) {
        s = new Scanner(System.in);
        Person ps1 = new Person();
        System.out.println("Please, enter your name: ");
        ps1.name = s.nextLine();
        System.out.println("Hi, "+ps1.name+". Please, enter your age: ");
        ps1.age = s.nextInt();
        ps1.speak();
        ps1.calculateYearsToRetirement();

    }
}
class Person{
    int age;
    String name;

    void calculateYearsToRetirement(){
        int years = 65-age;
        if (age >= 65){
            System.out.println("You are already retired.");
        } else
            System.out.println("you have " +years+" years to your retirement.");
    }

    void speak() {
        System.out.println("Ok, "+name+", "+"if you are "+age+" years old,");
    }
}


