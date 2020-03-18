package Lesson15Practice;

public class Dog extends Animal implements Action {
    @Override
    public void set() {
        System.out.println("Dog set action");
    }
}
