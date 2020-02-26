package Lesson12;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        addSixObjectsIfEmptyList(linkedList);
//        System.out.println(linkedList);
//        checkInstance(linkedList);
//        System.out.println(linkedList);
        System.out.println(checkInstance(linkedList));
        callMethods(linkedList);
        linkedList.clear();

        HashSet set = new HashSet();
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

//    static LinkedList checkInstance(LinkedList linkedList) {
//        int classOneCount = 0;
//        int classTwoCount = 0;
//        int classThreeCount = 0;
//
//        for (Object elem:linkedList) {
//            if (elem instanceof ClassOne) {
//                classOneCount++;
//                if (classOneCount > 2) {
//                    linkedList.remove(elem);
//                }
//            }
//            if (elem instanceof ClassTwo) {
//                classTwoCount++;
//                if (classTwoCount > 2) {
//                    linkedList.remove(elem);
//                }
//            }
//            if (elem instanceof ClassThree) {
//                classThreeCount++;
//                if (classThreeCount > 2) {
//                    linkedList.remove(elem);
//                }
//            }
//        }
//        return linkedList;
//    }

    public static LinkedList checkInstance(LinkedList linkedList) {
        int classOneCount = 0;
        int classTwoCount = 0;
        int classThreeCount = 0;

        for (int i = 0; i <linkedList.size() ; i++) {
            if (linkedList.get(i) instanceof ClassOne) {
                classOneCount++;
                if (classOneCount > 2) {
                    linkedList.remove(i);
                    i--;
                }
            } else if (linkedList.get(i) instanceof ClassTwo) {
                classTwoCount++;
                if (classTwoCount > 2) {
                    linkedList.remove(i);
                    i--;
                }
            } else if (linkedList.get(i) instanceof ClassThree) {
                classThreeCount++;
                if (classThreeCount > 2) {
                    linkedList.remove(i);
                    i--;
                }
            }
        }
        return linkedList;
    }

    static void callMethods(LinkedList linkedList) {
        for (int i = 0; i <linkedList.size() ; i++) {
            if (linkedList.get(i) instanceof ClassOne) {
                ((ClassOne) linkedList.get(i)).classOneMethod();
            }
            if (linkedList.get(i) instanceof ClassTwo) {
                ((ClassTwo) linkedList.get(i)).classTwoMethod();
            }
            if (linkedList.get(i) instanceof ClassThree) {
                ((ClassThree) linkedList.get(i)).classthreeMethod();
            }
        }
    }
}

