package Lesson3;
import java.util.Scanner;
/*
1. Используя класс Scanner, написать программу, которая будет запрашивать пользователя ввести данные о себе
 для регистрации и после введенных данных будет выводить всю информацию в консоль:

 o Введите Ваше имя:

 о Введите Вашу фамилию:

 о Укажите сколько Вам полных лет:

 о Введите Вашу почту для регистрации:

 о Напишите несколько слов о себе:

ps: Можно оформить как в классе Main, так и в отдельном методе или классе.
 При этом надо показать как вы будете вызывать данных класс или метод.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя : ");
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию : ");
        String surname = scanner.nextLine();

        System.out.println("Укажите сколько Вам полных лет : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите Вашу почту для регистрации : ");
        String email = scanner.nextLine();

        System.out.println("Напишите несколько слов о себе : ");
        String aboutUser = scanner.nextLine();

        System.out.println("Регистрация успешно завершена,данные вашего аккаунта :");
        System.out.println("- Имя : " + name);
        System.out.println("- Фамилия : " + surname);
        System.out.println("- Возраст : " + age + " лет");
        System.out.println("- Ваша почта : " + email);
        System.out.println("- Несколько слов о вас : " + aboutUser);
        scanner.close();

//        User alex = new User();
//        alex.age = 18;
//        alex.name = "Alex";
//        alex.surname = "Unknown";
//
//        alex.introduce();

    }
}
