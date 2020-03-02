package Lesson13;

import java.io.FileWriter;
import java.io.IOException;
/*
Задача 1:
Создайте программу-опросник(Можно вынести в отдельный класс с необходимым(и) методом(ами)).
Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя,
а значение это данные в виде тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
Тип значения ответа на вопрос указать на свое усмотрение.
После проведенного опроса программа должна записать результат в файл.
 */
public class MainFirstTask {
    public static void main(String[] args) throws IOException {
        QuestionToUser questionToUser = new QuestionToUser();
        questionToUser.writeUser(questionToUser.userInput().toString());
    }
}
