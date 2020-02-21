package Lesson10;

public final class Engineer extends Employee {
    private int category;
    private String technology;

    public Engineer() {
    }
    public Engineer(String name, int age, double salary, int experience, int category, String technology) {
        super(name, age, salary, experience);
        this.category = category;
        this.technology = technology;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public void repair() {
        System.out.println("Engineer repair everything");
    }
    @Override
    public String toString() {
        return "Engineer{" +
                "category=" + category +
                ", technology='" + technology + '\'' +
                '}';
    }
    @Override
    public void salary() {
        System.out.println("Engineer salary is 50000 $");
    }
    @Override
    public void bonus() {
        System.out.println("Engineer has bonus for overtime working");
    }
    @Override
    public void work() {
        System.out.println("Engineer is working");
    }
    @Override
    public void workHours() {
        System.out.println("Engineer work 8 hours");
    }
}
