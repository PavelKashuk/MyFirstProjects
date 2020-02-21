package Lesson8;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPosition("director");
        System.out.println(employee.getPosition());
    }
}
class Employee {
    private String position;
    private int age;
    private int experience;
    private int workingHours;
    private int category;
    private double rateSalary;
    private double salaryPerHour;
    private double BonusForExperience;
    private double overTimeSalary;

    public Employee() {
    }
    public Employee(String position) {
        this.position = position;
    }
    public Employee(String position, int age) {
        this.position = position;
        this.age = age;
    }
    public Employee(String position, int age, int experience) {
        this.position = position;
        this.age = age;
        this.experience = experience;
    }
    public Employee(String position, int age, int experience, int workingHours) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
    }
    public Employee(String position, int age, int experience, int workingHours, int category) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
        this.category = category;
    }
    public Employee(String position, int age, int experience, int workingHours, int category, double rateSalary) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
        this.category = category;
        this.rateSalary = rateSalary;
    }
    public Employee(String position, int age, int experience, int workingHours, int category, double rateSalary, double salaryPerHour) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
        this.category = category;
        this.rateSalary = rateSalary;
        this.salaryPerHour = salaryPerHour;
    }
    public Employee(String position, int age, int experience, int workingHours, int category, double rateSalary, double salaryPerHour, double bonusForExperience) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
        this.category = category;
        this.rateSalary = rateSalary;
        this.salaryPerHour = salaryPerHour;
        BonusForExperience = bonusForExperience;
    }
    public Employee(String position, int age, int experience, int workingHours, int category, double rateSalary, double salaryPerHour, double bonusForExperience, double overTimeSalary) {
        this.position = position;
        this.age = age;
        this.experience = experience;
        this.workingHours = workingHours;
        this.category = category;
        this.rateSalary = rateSalary;
        this.salaryPerHour = salaryPerHour;
        BonusForExperience = bonusForExperience;
        this.overTimeSalary = overTimeSalary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public double getRateSalary() {
        return rateSalary;
    }
    public void setRateSalary(double rateSalary) {
        this.rateSalary = rateSalary;
    }
    public double getSalaryPerHour() {
        return salaryPerHour;
    }
    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
    public double getBonusForExperience() {
        return BonusForExperience;
    }
    public void setBonusForExperience(double bonusForExperience) {
        BonusForExperience = bonusForExperience;
    }
    public double getOverTimeSalary() {
        return overTimeSalary;
    }
    public void setOverTimeSalary(double overTimeSalary) {
        this.overTimeSalary = overTimeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", workingHours=" + workingHours +
                ", category=" + category +
                ", rateSalary=" + rateSalary +
                ", salaryPerHour=" + salaryPerHour +
                ", BonusForExperience=" + BonusForExperience +
                ", overTimeSalary=" + overTimeSalary +
                '}';
    }
}