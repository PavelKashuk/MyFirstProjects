package Lesson10;

public final class Accountant extends Employee  {
    private double balance;
    private double tax;

    public Accountant() {
    }
    public Accountant(String name, int age, double salary, int experience, double balance, double tax) {
        super(name, age, salary, experience);
        this.balance = balance;
        this.tax = tax;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public void counting() {
        System.out.println("Accountant likes counting");
    }
    @Override
    public String toString() {
        return "Accountant{" +
                "balance=" + balance +
                ", tax=" + tax +
                '}';
    }
    @Override
    public void salary() {
        System.out.println("Accountant salary is 25000 $");
    }
    @Override
    public void bonus() {
        System.out.println("Accountant has bonus for overtime working");
    }
    @Override
    public void work() {
        System.out.println("Accountant is working");
    }
    @Override
    public void workHours() {
        System.out.println("Accountant work 8 hours");
    }
}
