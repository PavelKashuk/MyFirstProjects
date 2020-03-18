package Lesson16Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
1. Создайте класс Валидатор;
2. Добавьте статический метод validateColour, с одним входящим параметром - colour;
3. Метод вернет true, если параметр не null, не пустой и одно слово;
********************
1. Создайте файл, в котором будет перечень моделей авто;
2. Создайте метод checkModel. На вход принимает параметр model;
3. Метод считывает модели из заданного файла и проверяет совпадение;
4. Метод возвращает true, если модель находится в списке обслуживаемых;
*******************
1. Создайте метод checkId. Ничего не принимает, возвращает id нового заказа;
2. В методе: Создайте рандомно id от 1 до 100;
3. Получить все id(вызов предидущего метода) и проверить лимит регистрации до 100;
4. Если размер больше 100, то возвращает 0, если рандомный id уже есть в списке, то генерируется новый id, пока не будет уникальным;
5. Как только получилось сгенерировать уникальный id возвращаем его обратно
 */
public class Validator {
    private static final String PATH_TO_MODEL = "C:/Users/SASHA/IdeaProjects/MyFirstProjects/src/Lesson16Practice/carModels/models";
    private static final String PATH_TO_ID_LIST = "C:/Users/SASHA/IdeaProjects/MyFirstProjects/src/Lesson16Practice/idList/idList";

    public static int checkId() {
        Random random = new Random();
        int id = random.nextInt(99) + 1;
        ArrayList<Integer> ids = downloadIds();
        if (ids.size() > 100) {
            System.out.println("Service is busy. Try later.");
            return 0;
        }
        while (ids.contains(id)) {
            id = random.nextInt(99) + 1;
        }
//        System.out.println("Your id: " + id);
        return id;
    }

    private static ArrayList<Integer> downloadIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        try(FileReader fileReader = new FileReader(PATH_TO_ID_LIST);
            Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                ids.add(scanner.nextInt());
            }
        } catch (IOException e) {
            System.out.println("Read file exception: ");
            e.printStackTrace();
        }
        return ids;
    }

    public static boolean checkModel(String model) {
        boolean exist = false;
        try(FileReader fileReader = new FileReader(PATH_TO_MODEL);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                if (model.equalsIgnoreCase(scanner.next())) {
//                    System.out.println("Model is find");
                    exist = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Read file exception: ");
            e.printStackTrace();
        }
        return exist;
    }

    public static boolean validateColor(String color) {
        return color != null
                && !color.trim().isEmpty()
                && !color.trim().contains(" ");
    }
}
////////////////////////////////////////

//        if (color != null
//                && !color.trim().isEmpty()
//                && !color.trim().contains(" ")) {
//            System.out.println("Color entered successfully");
//        } else if (color == null) {
//            System.out.println("Error, color is null");
//        } else if (color.trim().isEmpty()) {
//            System.out.println("Error, enter a color");
//        } else if (color.trim().contains(" ")) {
//            System.out.println("Error, you must entered only one word");
//        }
//        return true;
//    }
//}
///////////////////////////////////////

//       boolean colorBool = false;
//       if (color != null
//                && !color.trim().isEmpty()
//                && !color.trim().contains(" ")) {
//           System.out.println("Color entered successfully");
//           colorBool = true;
//       }else if (color == null) {
//           System.out.println("Error, color is null");
//           colorBool = false;
//       }else if (color.trim().isEmpty()) {
//           System.out.println("Error, enter a color");
//           colorBool = false;
//       }else if (color.trim().contains(" ")) {
//           System.out.println("Error, you must entered only one word");
//           colorBool = false;
//       }
//       return colorBool;
//    }
//  }
