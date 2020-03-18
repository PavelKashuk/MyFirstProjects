package Lesson15Practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        setExample();

//        dynamicCheck(new Dog());
//        dynamicCheck(new Cat());
//
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(new Cat());
//        animals.add(new Dog());
//
//        ArrayList<Dog> dogs = new ArrayList<>();
//        ArrayList<Cat> cats = new ArrayList<>();
//        wildcardsExample(animals, dogs);
//        wildcardsExample(animals, cats);

        HashMap<String, HashMap<String, ArrayList<Boolean>>> schoolTests = new HashMap<>();
        HashMap<String, ArrayList<Boolean>> classMap = new HashMap<>();

        test(classMap);
        test(classMap);

        schoolTests.put("777", classMap);
        System.out.println(schoolTests.toString());
        //{777={alex=[true, true], bob=[true, false]}}

    }

    private static void test(HashMap<String, ArrayList<Boolean>> classMan) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        ArrayList<Boolean> answers = writeAnswers();

        classMan.put(name,answers);
    }

    private static ArrayList<Boolean> writeAnswers() {
        ArrayList<Boolean> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you a man?");
        boolean isMan = scanner.nextBoolean();
        System.out.println("Is adult?");
        boolean adult = scanner.nextBoolean();

        answers.add(isMan);
        answers.add(adult);
        return answers;

    }

    private static void wildcardsExample(ArrayList<? super Dog> animals, ArrayList<? extends Animal> dogs) {
//        dogs.add(new Dog());

        animals.add(new Dog());
        animals.add(new Husky());
    }

    private static void dynamicCheck(Action action) {
        action.set();

    }

    private static void setExample() {
        HashSet<String> set = new HashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.equals("Second")) {
                iterator.remove();
            }else {
                System.out.println(string);
            }
        }
        System.out.println(set.size());

        //        for (int i = 0; i < set.size(); i++) {
//            System.out.println(iterator.next());
//        }
    }
}