package Lesson10;

public final class Lawyer extends Employee  {
    private int reward;
    private String department;

    public Lawyer() {
    }
    public Lawyer(String name, int age, double salary, int experience, int reward, String department) {
        super(name, age, salary, experience);
        this.reward = reward;
        this.department = department;
    }
    public int getReward() {
        return reward;
    }
    public void setReward(int reward) {
        this.reward = reward;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void protect() {
        System.out.println("Lawyer will defend");
    }
    @Override
    public String toString() {
        return "Lawyer{" +
                "reward=" + reward +
                ", department='" + department + '\'' +
                '}';
    }
    @Override
    public void salary() {
        System.out.println("Lawyer salary is 75000 $");
    }
    @Override
    public void bonus() {
        System.out.println("Lawyer has bonus for overtime working");
    }
    @Override
    public void work() {
        System.out.println("Lawyer is working");
    }
    @Override
    public void workHours() {
        System.out.println("Lawyer work 8 hours");
    }
}
