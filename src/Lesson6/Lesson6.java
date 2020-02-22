package Lesson6;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/*
1. Дана строка: “ Hillel is my feature. I will be developer   ”
Необходимо выполнить следующие действия:
 о Проверить не пустой ли заданный текст;
 о Вывести длину данного текста;
 о Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
 о Используя команду получения значения из строки по индексу вывести “I”;
 о Используя команду обрезания вывести “developer”;
 о Добавить в конце строки знак “!”;
 о Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так,
	чтобы в одном случае они были равны, а в другом не равны;
 о Выведите данную строку в нижнем регистре;
 о Выведите данную строку в верхнем регистре;
2. Используя таблицу Unicode напечатайте 5 “необычных” символов, выберите из отпраленной таблицы символов;
3. Необходимо записать любое четверостишие в файл и считать.Условия:
 о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
 о Файл соответственно должен создаваться при записи;
 о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;
 о В завершение необходимо считать стих из созданного файла и вывести в консоль.
4. Написать программу “registration”. Условия:
 о При запуске, программа должна просить задать логин и пароль;
 о Поле пароль необходимо запросить 2 раза для правильного ввода;
 о В случае несовпадения паролей, программа должна выводить сообщение о не соответствии паролей и выходить.
 о В случае, если все указано верно, то данный (логин и пароль) должны записать в файл users.txt
	(где будут храниться все данные про пользователей);
5. Написать программу “login”. Условия:
 о При запуске программа должна просить ввести данные для входа: логин и пароль;
 о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
	то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
 о Если 3 попытки ввода логина и пароля были неуспешны,
	то выводить сообщение о просьбе повторить позже и останавливать программу.
 */

public class Lesson6 {
    public static void main(String[] args) throws Exception {
//        string(); // вывод первого задания
//        unicode(); // вывод второго задания
//        write(); // 3 задача
//        read(); //  3 задача
//        registration(); // 4 задача
        login();
//        existingUserLogin();
    }

    public static void string() { // первое задание
        String str = " Hillel is my feature. I will be developer ";
        System.out.println("String is Empty? " + str.isEmpty());
        System.out.println("String length: " + str.length());
        String trim = str.trim();
        System.out.println("String length after trim: " + trim.length());
        char charAt = trim.charAt(22);
        System.out.println("print char: " + charAt);
        System.out.println(trim.substring(32, 41));
        System.out.println(trim.substring(32, 41).concat("!"));
        String upper = "Hillel is my feature. I will be DEVELOPER";
        System.out.println("equals: " + trim.equals(upper));
        System.out.println("equalsIgnoreCase: " + trim.equalsIgnoreCase(upper));
        System.out.println("String to Lower Case: " + trim.toLowerCase());
        System.out.println("String to Upper Case: " + trim.toUpperCase());
    }

    public static void unicode() { // второе задание
        char unicodeChar1 = 1128;
        char unicodeChar2 = 1506;
        char unicodeChar3 = 1590;
        char unicodeChar4 = 2470;
        char unicodeChar5 = 2570;
        System.out.println(unicodeChar1);
        System.out.println(unicodeChar2);
        System.out.println(unicodeChar3);
        System.out.println(unicodeChar4);
        System.out.println(unicodeChar5);
    }

/////////////////// 3 задание


    private static void write() throws IOException {  //запись файла
        String path = "src/resources/file.txt";
        Path dirPath = Paths.get(path);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());

            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write("В город, в город за свиньёй\nЯ иду пешком.\nВозвращаюсь я домой\nНа свинье верхом. ");
            File file = new File(path);
            if (file.exists() && !file.isDirectory()) {
                System.out.println("Файл успешно записан!");
                // существует
            } else {
                System.out.println("Не удалось записать файл!");
                // не существует
            }
            fileWriter.close();
        }
    }

    private static void read() throws IOException {   //считывание записаного файла и проверка
        System.out.println("Содержание файла:");
//        String fileExists = "C:/Games/Introduction/src/resources/file.txt";
        String fileExists = "C:/Users/SASHA/IdeaProjects/MyFirstProjectss/src/resources/file.txt";
        FileReader fileReader = new FileReader(fileExists);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        fileReader.close();
        scanner.close();
    }


    public static void registration() throws IOException { // 4 задание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте логин и пароль");
        System.out.println("Введите ваш логин:");
        String login = scanner.nextLine();
        System.out.println("Введите ваш пароль:");
        String password = scanner.nextLine();
        System.out.println("Повторите пароль:");
        String password2 = scanner.nextLine();
        if (password.equals(password2)) {
            String path = "src/users/users.txt";
            Path dirPath = Paths.get(path);
            if (!Files.exists(dirPath.getParent())) {
                Files.createDirectories(dirPath.getParent());
            }
                FileWriter fileWriter = new FileWriter(path);
//                fileWriter.write("Login: " + login + "\n");
//                fileWriter.write("Password: " + password);
                fileWriter.write(login + "\n");
                fileWriter.write(password);
                System.out.println("Пользователь создан!");
                fileWriter.close();
//                PrintWriter pw = new PrintWriter(path);
//                pw.println(login);
//                pw.println(password);
//                pw.close();
            } else {
                System.out.println("Ошибка,пароли не совпадают!");
//                return;
            }
        }


//////////////////   5

    public static void login() throws IOException {
        boolean successLogin = false;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner lineReader = new Scanner(new File("src/users/users.txt"));
        String a = "";
        while (lineReader.hasNextLine()) {
            a = lineReader.nextLine();
//            System.out.println(a);
        }
        System.out.println(a);

//        while (successLogin == false && count < 3) {
        while (!successLogin && count < 3) {

            System.out.println("Введите ваш логин: ");
            String login = scanner.nextLine();
            System.out.println("Введите ваш пароль: ");
            String password = scanner.nextLine();

            if (a.equals(login)&& a.equals(password)) {
                System.out.println("Приветствуем, "+ a + "!");
                successLogin = true;
                scanner.close();
                lineReader.close();
            } else {
                System.out.println("Пользователя не сущетвует,повтрите ввод!");
                count++;
                if (count == 3) {
                    System.out.println("Вы использовали слишком много попыток,пожалуйста повторите позже!");
                    scanner.close();
                    lineReader.close();
                }
            }
        }
    }
}
 ////////////////////  Examples

//
//    boolean checkUsers = checkUserLogPass(readConsoleLogin(), readConsolePass()); // true or false
//        for (int i = 0; i < 3; i++) {
//        if (checkUsers) {
//        break;
//        } else {
//        System.out.println("Введите логин и пароль ещё раз.\nУ Вас осталось: " + (3 - i) + " шанc(а)");
//        checkUsers = checkUserLogPass(readConsoleLogin(), readConsolePass());
//        }
//        if (i == 2) {
//        System.out.println("Что-то пошло не так. Повторите попытку позже.");
//        }
//        }
//        }
//
//
//private static boolean checkUserLogPass(String loginCons, String passCons) throws IOException {
//        String fileLogPassPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";
//        FileReader fileReader = new FileReader(fileLogPassPath);
//        Scanner scanLogPassUsers = new Scanner(fileReader);
//        String userLoginConsole = loginCons;
//        String userPassConsole = passCons;
//
//        while (scanLogPassUsers.hasNextLine()) {
//        String usersLogin = scanLogPassUsers.nextLine();
//        String usersPass = scanLogPassUsers.nextLine();
////            boolean checkLoginPassword = userLoginConsole.equals(usersLogin) && userPassConsole.equals(usersPass);
//        while (userLoginConsole.equals(usersLogin) && userPassConsole.equals(usersPass)) {
//        boolean i = true;
//        System.out.println("Добро пожаловать в систему, " + usersLogin + "!");
//        scanLogPassUsers.close();
//        fileReader.close();
//        return i;
//        }
//        }
//        scanLogPassUsers.close();
//        fileReader.close();
//        return false;
//        }
//
//private static String readConsoleLogin() {
//        Scanner scanLogPass = new Scanner(System.in);
//        System.out.println("Введите логин:");
//        String enterLog = scanLogPass.next();
//        return enterLog;
//        }
//
//private static String readConsolePass() {
//        Scanner scanPass = new Scanner(System.in);
//        System.out.println("Введите пароль:");
//        String enterPass = scanPass.next();
//        return enterPass;
//        }
//        }
//
//
//
//////////////////////////////
//
//
//
//
//private static void existingUserLogin() throws IOException {
//        int tries = 0;
//        while (tries < 3) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter login: ");
//        String login = input.next();
//        System.out.print("Enter password: ");
//        String password = input.next();
//        tries += 1;
//        if (userValidate(login, password)){
//        tries = 3;
//        System.out.println(login + " welcome!");
//        } else if (tries < 3){
//        System.out.println("Wrong login or password. Try again.");
//        } else {
//        System.out.println("Login failed. Try later");
//        }
//        }
//        }
//private static boolean userValidate(String user, String password) throws IOException {
//        String userInput = user + "," + password;
//        String path = "./src/Resources/user.txt";
//        FileReader readFile = new FileReader(path);
//        Scanner scan = new Scanner(readFile);
//        while (scan.hasNextLine()){
//        if (userInput.equals(scan.nextLine())){
//        readFile.close();
//        scan.close();
//        return true;
//        }
//        }
//        readFile.close();
//        scan.close();
//        return false;
//        }