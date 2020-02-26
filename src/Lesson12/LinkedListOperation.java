package Lesson12;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOperation {

    static LinkedList addObjectsIfEmptyList(LinkedList linkedList) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();
        if (linkedList.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                linkedList.add(classOne);
            }
        }
        for (int i = 0; i < 3; i++) {
            linkedList.addFirst(classTwo);
        }
        for (int i = linkedList.size() - 3; i < linkedList.size(); i++) {
            linkedList.set(i, classThree);
        }
        return linkedList;
    }

    static List checkInstanceInList(LinkedList linkedList) {
        int classOneCounter = 0;
        int classTwoCounter = 0;
        int classThreeCounter = 0;

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof ClassOne) {
                classOneCounter++;
                if (classOneCounter > 2) {
                    linkedList.remove(i);
                    i--;
                }
            } else if (linkedList.get(i) instanceof ClassTwo) {
                classTwoCounter++;
                if (classTwoCounter > 2) {
                    linkedList.remove(i);
                    i--;
                }
            } else if (linkedList.get(i) instanceof ClassThree) {
                classThreeCounter++;
                if (classThreeCounter > 2) {
                    linkedList.remove(i);
                    i--;
                }
            }
        }
        return linkedList;
    }

    static void callMethods(LinkedList linkedList) {
        for (Object aLinkedList : linkedList) {
            if (aLinkedList instanceof ClassOne) {
                ((ClassOne) aLinkedList).classOneMethod();

            } else if (aLinkedList instanceof ClassTwo) {
                ((ClassTwo) aLinkedList).classTwoMethod();

            } else if (aLinkedList instanceof ClassThree) {
                ((ClassThree) aLinkedList).classThreeMethod();
            }
        }
    }
}
