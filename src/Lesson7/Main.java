package Lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Ralph");
        dog1.setAge(5);
        dog1.setWeight(25.5);
        System.out.println("Dog1 name: " + dog1.getName());
        System.out.println("Dog1 age: " + dog1.getAge() + " years");
        System.out.println("Dog1 weight: " + dog1.getWeight() + " kg");

        Dog dog2 = new Dog("Bob");
        System.out.println("Dog2 name: " + dog2.getName());

        Dog dog3 = new Dog("Marta",3);
        System.out.println("Dog3 name: " + dog3.getName());
        System.out.println("Dog3 age: " + dog3.getAge() + " years");

        Dog dog4 = new Dog("Liza", 7,17.5);
        System.out.println("Dog4 name: " + dog4.getName());
        System.out.println("Dog4 age: " + dog4.getAge() + " years");
        System.out.println("Dog4 weight: " + dog4.getWeight() + " kg");

        Cat cat1 = new Cat();
        cat1.setName("Tom");
        cat1.setAge(1);
        cat1.setWeight(2.5);
        System.out.println("Cat1 name: " + cat1.getName() + ",age: " + cat1.getAge() + " years,weight: " + cat1.getWeight() + " kg");

        Cat cat2 = new Cat("Luis");
        System.out.println("Cat2 name: " + cat2.getName());

        Cat cat3 = new Cat("Janna",4);
        System.out.println("Cat3 name: " + cat3.getName() + ",age: " + cat3.getAge() + " years");

        Cat cat4 = new Cat("Elli", 6, 4.25);
        System.out.println("Cat4 name: " + cat4.getName() + " ,age: " + cat4.getAge() + " years,weight: " + cat4.getWeight() + " kg") ;

        System.out.println("Cat1 " + cat1.toString());
        System.out.println("Cat2 " + cat2.toString());
        System.out.println("Cat3 " + cat3.toString());
        System.out.println("Cat4 " + cat4.toString());
    }
}
class Dog {
    private String name;
    private int age;
    private double weight;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}

    class Cat {
        private String name;
        private int age;
        private double weight;

        public Cat() {
        }
        public Cat(String name) {
            this.name = name;
        }
        public Cat(String name,int age) {
            this.name = name;
            this.age = age;
        }
        public Cat(String name,int age,double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public double getWeight() {
            return weight;
        }

        public String toString() {
            return "name: " + name + ",age: " + age + " years,weight: " + weight + " kg";
        }
    }

