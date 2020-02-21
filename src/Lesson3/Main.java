package Lesson3;
import java.util.Scanner;

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
