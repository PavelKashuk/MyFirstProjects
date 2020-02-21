package Lesson3;

public class User {
    String name;
    String surname;
    int age;
    String email;
    String aboutUser;

    public void introduce() {
        System.out.println("My name is : " + name);
        System.out.println("My surname is : " + surname);
        System.out.println("I'm : " + age);
        System.out.println("My email is : " + email);
        System.out.println("My surname is : " + aboutUser);
    }
}