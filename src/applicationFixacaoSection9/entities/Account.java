package applicationFixacaoSection9.entities;

public class Account {

    private String info;
    private String holder;
    private String number;
    private float balance;

    public Account(String holder, String number, float initialDepositValue){
        this.holder = holder;
        this.number = number;
        this.balance = initialDepositValue;
    }
    public Account(String holder, String number){
        this.holder = holder;
        this.number = number;
        this.balance = 0;
    }

    public float makeDeposit(float deposit){
        this.balance += deposit;
        return this.balance;
    }

    public float makeWithdraw(float withdraw){
        this.balance -= withdraw - 5.0;
        return this.balance;
    }

    public String toString() {
        return info
                + "Account"
                + this.number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", );
    }

    public String getHolder() {
        return holder;
    }

    public String getNumber() {
        return number;
    }

    public float getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

}
