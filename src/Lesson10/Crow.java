package Lesson10;

public final class Crow extends Bird {
    private String location;
    private String beakType;

    public Crow() {
    }
    public Crow(String kind, int age, double weight, int lifeTime, String location, String beakType) {
        super(kind, age, weight, lifeTime);
        this.location = location;
        this.beakType = beakType;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getBeakType() {
        return beakType;
    }
    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }
    @Override
    public String toString() {
        return "Crow{" +
                "location='" + location + '\'' +
                ", beakType='" + beakType + '\'' +
                '}';
    }
    public void nightVisibility() {
        System.out.println("Crows not visible at night");
    }
    @Override
    public void fly() {
        System.out.println("Crows can't live without flying");
    }
    @Override
    public void live() {
        System.out.println("Crows is exist");
    }
    @Override
    public void say() {
        System.out.println("Crows make sounds");
    }
    @Override
    public void hear() {
        System.out.println("Crows hear very good");
    }
    @Override
    public void eat() {
        System.out.println("Crows eat every day");
    }
    @Override
    public void sleep() {
        System.out.println("Crows sleep a lot of time");
    }
    @Override
    public void wingsRange() {
        System.out.println("Crows range of wings is big ");
    }
    @Override
    public void wingsPower() {
        System.out.println("Crows have strong wings ");
    }
}
