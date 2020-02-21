package Lesson10;

public final class Eagle extends Bird {
    private double flyingHeight;
    private double rangeOfVision;

    public Eagle() {
    }
    public Eagle(String kind, int age, double weight, int lifeTime, double flyingHeight, double rangeOfVision) {
        super(kind, age, weight, lifeTime);
        this.flyingHeight = flyingHeight;
        this.rangeOfVision = rangeOfVision;
    }
    public double getFlyingHeight() {
        return flyingHeight;
    }
    public void setFlyingHeight(double flyingHeight) {
        this.flyingHeight = flyingHeight;
    }
    public double getRangeOfVision() {
        return rangeOfVision;
    }
    public void setRangeOfVision(double rangeOfVision) {
        this.rangeOfVision = rangeOfVision;
    }
    @Override
    public String toString() {
        return "Eagle{" +
                "flyingHeight=" + flyingHeight +
                ", rangeOfVision=" + rangeOfVision +
                '}';
    }
    public void hunting() {
        System.out.println("Eagles hunting every day");
    }
    @Override
    public void fly() {
        System.out.println("Eagles can't live without flying");
    }
    @Override
    public void live() {
        System.out.println("Eagles is exist");
    }
    @Override
    public void say() {
        System.out.println("Eagles make sounds");
    }
    @Override
    public void hear() {
        System.out.println("Eagles hear very good");
    }
    @Override
    public void eat() {
        System.out.println("Eagles eat every day");
    }
    @Override
    public void sleep() {
        System.out.println("Eagles sleep a lot of time");
    }
    @Override
    public void wingsRange() {
        System.out.println("Eagles range of wings is big ");
    }
    @Override
    public void wingsPower() {
        System.out.println("Eagles have strong wings ");
    }
}
