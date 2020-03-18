package Lesson16Practice;
/*
1. Создайте класс Автомобиль;
2. У данного класса 3 поля: id(int), model(String), colour(String);
3. Добавьте необходимые конструкции для дальнейшей работы класса;
 */
public class Car {
    int id;
    String model;
    String color;

    public Car() {
    }

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
