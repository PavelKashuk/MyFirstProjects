package Lesson12;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static Lesson12.LinkedListOperation.*;
import static Lesson12.HashSetOperation.*;
/*
Выполните все пункты как одно решение задачи:
1. Создайте 3 класса, в каждом из которых будет по одному методу с разным названием(Остальное не имеет значения);
2. Создайте Список(List);
3. Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующие итерации:
а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
б). После добавьте в начало списка 3 объекта 2го Вашего класса;
в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
4. Создайте второй метод, который на вход будет принимать Список и возвращать список и будет выполнять следующую логику:
Проверять количество экземпляров класса в принятом Списке и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме).
5. Создать третий метод, который также будет принимать Список и будет в зависимости от экземпляра класса вызывать Ваши методы.
После вызова всех методов всех классов очистите Список.
6. Повторите описанную логику Выше с набором(Set). В данном задании Вам понадобиться воспользоваться Итератором(Iterator).
 */
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

