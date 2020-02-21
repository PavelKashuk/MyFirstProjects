package Lesson8;

public class Car {
     final private String model;
     final private double price;
     final private double engineCapacity;

//    public Car() {      // ругаеться на конструктор по умолчанию,нужно проинициализировать параметры
//    }
    public Car(String model, double price, double engineCapacity) {
        this.model = model;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }
//    public void setModel(String model) {     // Нельзя инициализировать сеттеры,так как значение устанавливаеться только один раз без права перезаписи
//        this.model = model;
//    }
    public String getModel() {
        return model;
    }
//    public void setPrice(double price) {
//        this.price = price;
//    }
    public double getPrice() {
        return price;
    }
//    public void setEngineCapacity(double engineCapacity) {
//        this.engineCapacity = engineCapacity;
//    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
}
