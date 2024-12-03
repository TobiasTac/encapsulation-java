
package entities;

public class Account {
    private int account;
    private String holder;
    private double balance;

    public Account(){
    }

    public Account(int account, String holder){
        this.account = account;
        this.holder = holder;
    }
    public Account(int account, String holder, double initialDeposit){
        this.account = account;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.00;
    }

    public String toString() {
        return  "Account " + getAccount() +
                ", Holder: " + getHolder() +
                ", Balance: $ " + String.format("%.2f", getBalance());
    }

    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
}