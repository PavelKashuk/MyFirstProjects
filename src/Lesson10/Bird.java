package Lesson10;

public abstract class Bird extends Animal implements Say, WingsRange{
    private double weight;
    private int lifeTime;

    public Bird() {
    }
    public Bird(String kind, int age, double weight, int lifeTime) {
        super(kind, age);
        this.weight = weight;
        this.lifeTime = lifeTime;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getLifeTime() {
        return lifeTime;
    }
    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
