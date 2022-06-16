package _07_DefiningClasses;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int accountCount = 0;
    private int id;
    private double balance;


    public BankAccount() {
        accountCount++;
        this.id = accountCount;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public double getInterest(int years) {
        return years * interestRate * balance;
    }
}
