package applications.applicationFixacaoSection9.entities;

public class Account {
    private String holder;
    private String number;
    private double balance;

    public Account(){

    }
    public Account(String holder, String number, double initialDepositValue){
        this.holder = holder;
        this.number = number;
        makeDeposit(initialDepositValue);
    }
    public Account(String holder, String number){
        this.holder = holder;
        this.number = number;
    }

    public double makeDeposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double makeWithdraw(double amount){
        this.balance -= amount - 5.0;
        return this.balance;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f",this.balance);
    }

    public String getHolder() {
        return holder;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

}
