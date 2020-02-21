package Lesson10;

public abstract class Employee extends Person implements Salary{
    private double salary;
    private int experience;

    public Employee() {
    }
    public Employee(String name, int age, double salary, int experience) {
        super(name, age);
        this.salary = salary;
        this.experience = experience;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void goToWork() {
        System.out.println("Employee go to work");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
