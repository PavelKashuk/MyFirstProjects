package Lesson9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Admin extends User {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }


    public boolean checkAndDelete(boolean del) throws FileNotFoundException {
        String path = "src/lesson9/user/user.txt";
        File file = new File(path);
        if (file.exists() && del) {
            file.delete();
            System.out.println("File's delete");
        } else if (!file.exists() && del) {
            System.out.println("File's already deleted");
        }
        System.out.println("File's not found");
        return del;
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
