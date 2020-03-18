package Lesson16Practice;

import java.util.Scanner;

/*
1. Создайте класс Main для написания основной логики;
2. Первым шагом вызываем метод, который генерирует у  нас id;
3. Если количество зарегистрированных машин превышено, обрываем программу;
**********************
1. Продолжаем логику и просим ввести пользователя модель автомобиля;
2. С помощью нашего метода проверяем модель в списке, если такой нет-обрываем работу;
**********************
1. Продолжаем логику и просим ввести пользователя цвет автомобиля;
2. Используя еще один наш метод валидируем корректность введенного цвета;
3. Если цвет введен не корректно, то просим повторить ввод;
**********************
1. Продолжаем логику создаем экземпляр класса Car с введенными параметрами;
2. Спрашиваем у пользователя правильно ли записаны данные, напечатав параметры;
3. Если соглашается, то поздравляем, если нет - прощаемся;
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to registration in our AutoService!");
        int resultId = Validator.checkId();

        if (resultId == 0) {
            System.out.println("Error, try again");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car model: ");
        String model = scanner.next();
        if (!Validator.checkModel(model)) {
            System.out.println("We don't work with " + model + " model of cars, Sorry!");
            return;
        }

        System.out.println("Enter color of your car: ");
        String color = scanner.next();
        while (!Validator.validateColor(color)) {
            System.out.println("Sorry, but you entered wrong color. Try again");
            color = scanner.next();
        }

        Car car = new Car(resultId, model, color);
        System.out.println("Is it you car data correct? write: y/n");
        System.out.println(car.toString());
        String result = scanner.next();

        if (result.equalsIgnoreCase("y")) {
            System.out.println("Your car registered!");
        } else {
            System.out.println("Try again or see you later!");
        }
    }
}
