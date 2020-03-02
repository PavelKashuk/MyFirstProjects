package Lesson13;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestionToUser {
    private final String QUESTION_NAME = "Enter your name: ";
    private final String QUESTION_AGE = "Enter your age: ";
    private final String QUESTION_COUNTRY = "Enter your country";
    private final String QUESTION_EMAIL = "Enter your email";
    private HashMap <String, Map<String,String>> userAnswers = new HashMap<>();

    public Map userInput() {
        Scanner scanner = new Scanner(System.in);
        HashMap <String,String> questionAndAnswer = new HashMap<>();

        System.out.println(QUESTION_NAME);
        String name = scanner.nextLine();
        questionAndAnswer.put(QUESTION_NAME,name);

        System.out.println(QUESTION_AGE);
        String age = scanner.nextLine();
        questionAndAnswer.put(QUESTION_AGE,age);

        System.out.println(QUESTION_COUNTRY);
        String country = scanner.nextLine();
        questionAndAnswer.put(QUESTION_COUNTRY,country);

        System.out.println(QUESTION_EMAIL);
        String email = scanner.nextLine();
        questionAndAnswer.put(QUESTION_EMAIL,email);

        userAnswers.put(name,questionAndAnswer);
        System.out.println(userAnswers);

        return userAnswers;
    }

    public void writeUser(String userAnswers) throws IOException {
        String path = "src/Lesson13/Users/Users.txt";
        Path directoryPath = Paths.get(path);
        if (!Files.exists(directoryPath.getParent())) {
            Files.createDirectories(directoryPath.getParent());
        }

        FileWriter userWriter = new FileWriter(path, true);
        userWriter.write(userAnswers + "\n");
        userWriter.close();
    }
}
