package Lesson10;
/*
Имея представления об обычных классах, абстрактных классах и интерфейсах необходимо создать следующие реализации:
Создайте 2 цепочки классов(из примера в классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),
только придумать свои классы. Условия:
а). Всего классов для каждой цепочки должно быть 5;
б). Один главный класс, второй - наследуется от главного, и еще 3 класса, которые наследуются от второго;
в). Главный класс и второй класс наследник должен быть “без возможности создавать экземпляр класса”
(подумайте какими именно должны быть классы?)
г). В каждом класса должно быть минимум по 2 характеристики и по 1 методу(дополнительному);
д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
е). Финальные 3 класса-наследника в каждой цепочке должны быть “не наследуемые”;
Создайте 5 интерфейсов со следующими условиями:
а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
б). У каждого из 5 интерфейсов определите 2 заданных метода;
в). Одна цепочка классов должна имплементировать одну связку интерфейсов,
а вторая цепочка классов должна имплементировать другую связку интерфейсов и оставшийся отдельный интерфейс;
В классе Main создайте экземпляры всех классов и интерфейсов,
запишите значения характеристик там где возможно и вызовите все реализованные дополнительные методы в них.
 */
public class Main {
    public static void main(String[] args) {
//    Engineer engineer = new Engineer();
//        engineer.setName("Robert");
//        engineer.setAge(30);
//        engineer.setSalary(50000);
//        engineer.setExperience(8);
//        engineer.setTechnology("QA");
//        engineer.setCategory(1);
//
//        System.out.println(engineer.getName());
//        System.out.println(engineer.getAge());
//        System.out.println(engineer.getSalary());
//        System.out.println(engineer.getExperience());
//        System.out.println(engineer.getTechnology());
//        System.out.println(engineer.getCategory());
//
//        engineer.speak();
//    engineer.goToWork();
//    engineer.repair();
//    engineer.work();
//    engineer.workHours();
//    engineer.salary();
//    engineer.bonus();
//
//    Accountant accountant = new Accountant();
//    accountant.speak();
//    accountant.goToWork();
//    accountant.counting();
//    accountant.work();
//    accountant.workHours();
//    accountant.salary();
//    accountant.bonus();
//
//    Lawyer lawyer = new Lawyer();
//    lawyer.speak();
//    lawyer.goToWork();
//    lawyer.protect();
//    lawyer.work();
//    lawyer.workHours();
//    lawyer.salary();
//    lawyer.bonus();

    Eagle eagle = new Eagle();
    eagle.live();
    eagle.fly();
    eagle.hunting();
    eagle.eat();
    eagle.sleep();
    eagle.say();
    eagle.hear();
    eagle.wingsPower();
    eagle.wingsRange();

    Crow crow = new Crow();
        crow.live();
        crow.fly();
        crow.nightVisibility();
        crow.eat();
        crow.sleep();
        crow.say();
        crow.hear();
        crow.wingsPower();
        crow.wingsRange();

        Swan swan = new Swan();
        swan.live();
        swan.fly();
        swan.ableToSwim();
        swan.eat();
        swan.sleep();
        swan.say();
        swan.hear();
        swan.wingsPower();
        swan.wingsRange();

    }
}
