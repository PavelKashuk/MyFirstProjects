package Lesson9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {
    public Support() {
    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public boolean checkString(String string) throws IOException {
        String path = "src/Lesson9/user/user.txt";
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            if (string.equals(scanner.nextLine())) {
                System.out.println("i found");
                fileReader.close();
                scanner.close();
                return true;
            }
        }
        System.out.println("nope");
        fileReader.close();
        scanner.close();
        return false;
    }
}

//public final class Support extends User {
//    public boolean checkString(String string) throws IOException {
//        String path = "src/lesson9/user/user.txt";
//        FileReader readFile = new FileReader(path);
//        Scanner scan = new Scanner(readFile);
//        while (scan.hasNextLine()) {
//            if (string.equals(scan.nextLine())) {
//                System.out.println("i found");
//                readFile.close();
//                scan.close();
//                return true;
//            }
//        }
//        System.out.println("nope");
//        readFile.close();
//        scan.close();
//        return false;
//    }
//}