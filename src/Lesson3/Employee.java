package Lesson3;

/*
6. Создайте класс “Employee”, у которого будет три переменные: double:“salary”, String:“position”, int:”age”.
        Выполните определенные действия, чтобы сравнение сотрудников производилось не по ссылке, а по значению полей.
        В классе Main создайте 2 одинаковых сотрудника и выполните сравнения используя “==” и “equals()”.

 */

import java.util.Objects;

public class Employee {
    double salary;
    String position;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, position, age);
    }
}

////////////////

//import java.util.Objects;
//
//public class Main {
//    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        employee1.salary = 1000.50;
//        employee1.position = "Developer";
//        employee1.age = 25;
//
//        Employee employee2 = new Employee();
//        employee2.salary = 1000.50;
//        employee2.position = "Developer";
//        employee2.age = 25;
//
//        System.out.println(employee1 == employee2);  //false
//        System.out.println(employee1.equals(employee2));  // true
//    }
//
//}

