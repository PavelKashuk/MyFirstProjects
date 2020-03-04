package Lesson14;

import com.sun.applet2.preloader.CancelException;

import javax.activity.ActivityCompletedException;
import javax.naming.ConfigurationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
1. Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”(checked) ошибки.
Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);
2. Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать по одному методу первого класса.
Эти методы не должны обрабатывать возможные ошибки, а просто пробрасывают полученную ошибку выше;
3. Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций обработки ошибок:
а). try-catch-finally;
б). try-catch-catch-finally;
в). try-catch-catch-catch-finally;
г). try(with resources)-catch-finally;
д). try-finally;
(в каждой конструкции try должны быть вызовы 3х методов промежуточного класса с разными ошибками).
 */
public class Main {
    public static void main(String[] args) {
        catchExample();
        twoCatchExample();
        threeCatchExample();
        withResourcesExample();
        withoutCatchExample();
    }

    public static void catchExample() {
        try {
            CallException.callFirstException();
            CallException.callSecondException();
            CallException.callThirdException();
        } catch (ActivityCompletedException | CancelException | ConfigurationException e) {
            System.out.println("Errors from First,Second and Third exceptions: " + e);
//            e.printStackTrace();
        }finally {
            System.out.println("Always work");
        }
    }
    public static void twoCatchExample() {
        try {
            CallException.callFirstException();
            CallException.callSecondException();
            CallException.callThirdException();
        } catch (ActivityCompletedException | CancelException e) {
            System.out.println("Errors from First and Second Exceptions:" + e);
//            e.printStackTrace();
        } catch (ConfigurationException e) {
            System.out.println("Error from Third Exception: " + e);
//            e.printStackTrace();
        }finally {
            System.out.println("Always work");
        }
    }

    public static void threeCatchExample() {
        try {
            CallException.callFirstException();
            CallException.callSecondException();
            CallException.callThirdException();
        } catch (ActivityCompletedException e) {
            System.out.println("First Error: " + e);
//            e.printStackTrace();
        } catch (CancelException e) {
            System.out.println("Second Error: " + e);
//            e.printStackTrace();
        } catch (ConfigurationException e) {
            System.out.println("Third Error: " + e);
//            e.printStackTrace();
        }finally {
            System.out.println("Always work");
        }
    }

    public static void withResourcesExample() {
       String path;
        path = "C:/Users/SASHA/IdeaProjects/MyFirstProjects/src/Lesson14/test/test";
        try (FileReader fileReader = new FileReader(path);
             Scanner scanner = new Scanner(fileReader)) {
            if (scanner.hasNextLine()) {
                try {
                    CallException.callFirstException();
                    CallException.callSecondException();
                    CallException.callThirdException();
                } catch (ActivityCompletedException | CancelException | ConfigurationException e) {
                    System.out.println("Errors from First,Second and Third exceptions: " + e);
//                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader or Scanner exception: " + e);
//            e.printStackTrace();
        }finally {
            System.out.println("Always work");
        }
    }

     public static void withoutCatchExample() {
        try {
            throw new RuntimeException();
        }finally {
            try {
                CallException.callFirstException();
                CallException.callSecondException();
                CallException.callThirdException();
            } catch (ActivityCompletedException | CancelException | ConfigurationException e) {
                System.out.println("Errors from First,Second and Third exceptions: " + e);
//                e.printStackTrace();
            }
        }
    }
}
