package Lesson10;

public final class Swan extends Bird {
    private String color;
    private double neckLength;

    public Swan() {
    }
    public Swan(String kind, int age, double weight, int lifeTime, String color, double neckLength) {
        super(kind, age, weight, lifeTime);
        this.color = color;
        this.neckLength = neckLength;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getNeckLength() {
        return neckLength;
    }
    public void setNeckLength(double neckLength) {
        this.neckLength = neckLength;
    }
    @Override
    public String toString() {
        return "Swan{" +
                "color='" + color + '\'' +
                ", neckLength=" + neckLength +
                '}';
    }
    public void ableToSwim() {
        System.out.println("Swans able to swim");
    }
    @Override
    public void fly() {
        System.out.println("Swans can't live without flying");
    }
    @Override
    public void live() {
        System.out.println("Swans is exist");
    }
    @Override
    public void say() {
        System.out.println("Swans make sounds");
    }
    @Override
    public void hear() {
        System.out.println("Swans hear very good");
    }
    @Override
    public void eat() {
        System.out.println("Swans eat every day");
    }
    @Override
    public void sleep() {
        System.out.println("Swans sleep a lot of time");
    }
    @Override
    public void wingsRange() {
        System.out.println("Swans range of wings is big ");
    }
    @Override
    public void wingsPower() {
        System.out.println("Swans have strong wings ");
    }
}
