package Lesson12;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static Lesson12.LinkedListOperation.*;
import static Lesson12.HashSetOperation.*;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        addObjectsIfEmptyList(linkedList);
        System.out.println(linkedList);
        System.out.println(checkInstanceInList(linkedList));
        callMethods(linkedList);
        linkedList.clear();

        Set set = new HashSet();
        HashSetOperation.addObjectsIfEmptySet(set);
        System.out.println(set);
        HashSetOperation.checkInstanceInSet(set);
        System.out.println(set);
        HashSetOperation.callMethodsInSet(set);
        set.clear();
    }
}

