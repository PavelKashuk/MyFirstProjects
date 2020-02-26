package Lesson12;

import java.util.Iterator;
import java.util.Set;

public class HashSetOperation {

    static Set addObjectsIfEmptySet(Set set) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();
        if (set.isEmpty()) {

            for (int i = 0; i < 6; i++) {
                set.add(classOne);
            }
            // set doesn't support add first
            for (int i = 0; i < 3; i++) {
                set.add(classTwo);
            }

            // set doesn't support set operations
            for (int i = 0; i < 3; i++) {
                set.add(classThree);
            }
        }
        return set;
    }

    static Set checkInstanceInSet(Set set) {
        int classOneCounter = 0;
        int classTwoCounter = 0;
        int classThreeCounter = 0;
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Object elem = iterator.next();
            if (elem instanceof ClassOne) {
                classOneCounter++;
                if (classOneCounter > 2) {
                    iterator.remove();


                }
            } else if (elem instanceof ClassTwo) {
                classTwoCounter++;
                if (classTwoCounter > 2) {
                    iterator.remove();

                }
            } else if (elem instanceof ClassThree) {
                classThreeCounter++;
                if (classThreeCounter > 2) {
                    iterator.remove();
                }
            }
        }
        return set;
    }

    static void callMethodsInSet(Set set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object elem = iterator.next();
            if (elem instanceof ClassOne) {
                ((ClassOne) elem).classOneMethod();

            } else if (elem instanceof ClassTwo) {
                ((ClassTwo) elem).classTwoMethod();

            } else if (elem instanceof ClassThree) {
                ((ClassThree) elem).classThreeMethod();
            }
        }
    }
}