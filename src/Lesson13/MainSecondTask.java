package Lesson13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/*
Задача 2:
1. Создайте 3 класса, которые линейно наследуются друг от друга.
Должна быть возможность создать экземпляр класса каждого из наследников(подумайте какой тип класса должен быть).
2. В каждом из классов должно быть 3 поля(на свое усмотрение), которые имеют тип переменной List/Set/Map,
то есть будут по 1 переменной с типом List, Set и Map.(Зная принципы ООП будьте внимательны реализуя переменные в классах!).
3. Далее зная про Wildcards реализуйте метод, который на вход будет принимать 2 List/Set/Map(На Ваше усмотрение, не принципиально),
один из которых будет разрешать передать всех наследников от среднего класса(Вашего),
второй - будет разрешать передать всех кто выше в наследовании от среднего класса(Вашего).
4. Логика внутри метода данного: заполнение из одной коллекции данными в другую коллекцию.
 */
public class MainSecondTask {
    public static void main(String[] args) {
    List<ClassThird> classThirdLinkedList = new LinkedList<>();
        classThirdLinkedList.add(new ClassThird());

    Set<ClassFirst> classFirstHashSet = new HashSet<>();
        classFirstHashSet.add(new ClassFirst());

    addAllToCollections(classThirdLinkedList, classFirstHashSet);
}

    public static void addAllToCollections(List<? extends ClassSecond> list,
                                         Set<? super ClassSecond> set) {

            set.addAll(list);
    }
}
