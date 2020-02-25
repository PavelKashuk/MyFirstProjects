package Lesson12;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        addSixObjectsIfEmptyList(linkedList);
        System.out.println(linkedList);
        callMethods(linkedList);
//        System.out.println(checkInstance(linkedList)); //concurrent modification exception here
        linkedList.clear();
    }


    static LinkedList addSixObjectsIfEmptyList(LinkedList linkedList) {
        if (linkedList.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                linkedList.add(new ClassOne());
            }
        }
        for (int i = 0; i < 3; i++) {
            linkedList.addFirst(new ClassTwo());
        }
        for (int i = linkedList.size() - 3; i < linkedList.size(); i++) {
            linkedList.set(i, new ClassThree());
        }
        return linkedList;
    }

    static LinkedList checkInstance(LinkedList linkedList) {
        int classOneCount = 0;
        int classTwoCount = 0;
        int classThreeCount = 0;

        for (Object elem:linkedList) {
            if (elem instanceof ClassOne) {
                classOneCount++;
                if (classOneCount > 2) {
                    linkedList.remove(elem);
                }
            }
            if (elem instanceof ClassTwo) {
                classTwoCount++;
                if (classTwoCount > 2) {
                    linkedList.remove(elem);
                }
            }
            if (elem instanceof ClassThree) {
                classThreeCount++;
                if (classThreeCount > 2) {
                    linkedList.remove(elem);
                }
            }
        }
        return linkedList;
    }

    static void callMethods(LinkedList linkedList) {
        for (Object elem : linkedList) {
            if (elem instanceof ClassOne) {
                ((ClassOne) elem).classOneMethod();
            }
            if (elem instanceof ClassTwo) {
                ((ClassTwo) elem).classTwoMethod();
            }

            if (elem instanceof ClassThree) {
                ((ClassThree) elem).classthreeMethod();
            }
        }
    }
}

