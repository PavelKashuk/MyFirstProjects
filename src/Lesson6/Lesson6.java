package Lesson6;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


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
                return;
            }
        }


////////////////////////////////////////////////////////


//    private static void existingUserLogin() throws IOException {
//        int tries = 0;
//        while (tries < 3) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter login: ");
//            String login = input.next();
//            System.out.print("Enter password: ");
//            String password = input.next();
//            tries += 1;
//            if (userValidate(login, password)) {
//                tries = 3;
//                System.out.println(login + " welcome!");
//            } else if (tries < 3) {
//                System.out.println("Wrong login or password. Try again.");
//            } else {
//                System.out.println("Login failed. Try later");
//            }
//        }
//    }
//
//    private static boolean userValidate(String user, String password) throws IOException {
//        String userInput = user + "," + password;
//        String path = "./src/users/users.txt";
//        FileReader readFile = new FileReader(path);
//        Scanner scan = new Scanner(readFile);
//        while (scan.hasNextLine()) {
//            if (userInput.equals(scan.nextLine())) {
//                readFile.close();
//                scan.close();
//                return true;
//            }
//        }
//        readFile.close();
//        scan.close();
//        return false;
//    }
//}


////////////////////////////////////////////////////////////////////////////////


//    public static void login() throws IOException {  //  5 задание
//        Scanner scanner = new Scanner(System.in);
//        Scanner lineReader = new Scanner(new File("src/users/users.txt"));
//        System.out.println("Введите ваш логин: ");
//        String login = scanner.nextLine();
//        System.out.println("Введите ваш пароль: ");
//        String password = scanner.nextLine();
//        int count = 3;
//        String a = "";
//        while (lineReader.hasNext()) {
//            a = lineReader.nextLine();
//        }
//            if (a.contains(login) && a.contains(password)) {
//                System.out.println("Приветствуем, " + a + "!");
//            } else if
//                (!a.contains(login) && !a.contains(password)) {
//                    System.out.println("Пользователя не сущетвует,повтрите ввод!");
//                }
//             else {
//                for (int i = 1; i <= count; i++) {
//                return;
//                }
//                System.out.println("Вы использовали слишком много попыток,пожалуйста повторите позже!");
//            }
//    }
//}

///////////////////////////////////////////////////
//
//    boolean check = false;
//    String path = "src/lesson9/user/user.txt";
//    FileReader fileReader = new FileReader(path);
//    Scanner scanner = new Scanner(fileReader);
//        while (scanner.hasNextLine()) {
//        if (string.equals(scanner.nextLine())) {
//            check = true;
//            System.out.println("i found");
//            scanner.close();
//            fileReader.close();
//        } else {
//            check = false;
//            System.out.println("nope");
//            fileReader.close();
//            scanner.close();
//        }
//    }
//        return check;

/////
//public static void login() throws IOException {
//    boolean successLogin = false;
//    int count = 0;
//    String path = "src/users/users.txt";
////    FileReader fileReader = new FileReader(path);
//    Scanner scanner = new Scanner(System.in);
//    Scanner lineReader = new Scanner(new File(path));
////    Scanner lineReader = new Scanner(new File("src/users/users.txt"));
//    String a = "";
//    while (lineReader.hasNextLine()) {
//        a += lineReader.nextLine()+"\n";
////            System.out.println(a);
//    }
//    System.out.println(a);
//
//    while (successLogin == false && count < 3) {
//
//        System.out.println("Введите ваш логин: ");
//        String login = scanner.nextLine();
//        System.out.println("Введите ваш пароль: ");
//        String password = scanner.nextLine();
//
//        if (path.equals(login)&& password.equals(password)) {
//            System.out.println("Приветствуем, "+ a + "!");
//            successLogin = true;
//            scanner.close();
//            lineReader.close();
//        } else {
//            System.out.println("Пользователя не сущетвует,повтрите ввод!");
//            count++;
//            if (count == 3) {
//                System.out.println("Вы использовали слишком много попыток,пожалуйста повторите позже!");
//                scanner.close();
//                lineReader.close();
//            }
//        }
//    }
//}
//}
//////////////////////////////////////

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

        while (successLogin == false && count < 3) {

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




//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите ваш логин:");
//        String login = scanner.nextLine();
//        System.out.println("Введите ваш пароль:");
//        String password = scanner.nextLine();

//        Scanner linReader = new Scanner(new File("src/users/users.txt"));
//        while (linReader.hasNext())
//        {
//            String line = linReader.nextLine();
//            System.out.println(line);
//        }
//        linReader.close();

//        String fileName = "src/users/users.txt";
//        Optional<String> line = Files.lines(Paths.get(fileName)).findFirst();
//        System.out.println(line.get());

//        String fileName = "src/users/users.txt";
//        File file = new File(fileName);

//        List fileLinesList = Files.readAllLines(file.toPath());
//
//        for (Object line : fileLinesList) {
//            System.out.println("Добро пожаловать, " + login); }


//            if (password.equals(fileLinesList) && login.equals(fileLinesList)) {
//                System.out.println("Добро пожаловать, " + login);
//            } else if (!password.equals(fileLinesList) && login.equals(fileLinesList)) {
//                System.out.println("Данные не верны, повторите попытку");
//            }

//        List<String> lines = Files.readAllLines(Paths.get("src/users/users.txt"), UTF_8);
//
//        for (String s : lines) {
//            System.out.println(s);
//        }
