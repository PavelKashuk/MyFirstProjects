package Lesson9;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.read("user");
        user.write();
        Support support = new Support();
        support.checkString("Bob");
        Admin admin = new Admin();
        admin.checkAndDelete(true);
        instanceOfCheck(user);

    }

    private static void instanceOfCheck(User user) throws IOException {
        if (user instanceof Admin) {
            user.write();
            ((Admin) user).checkString("User");
            ((Admin) user).checkAndDelete(true);
            System.out.println("It's an Admin");
        } else if (user instanceof Support) {
                user.write();
                ((Support) user).checkString("User");
                System.out.println("It's a Support");
        } else {
            user.write();
            System.out.println("It's an User");
        }
    }
}