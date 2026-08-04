package OOPS.Bank;

public class Account {

    protected float balance = 0;
    private final String accountHolderName;
    private final int accountNumber;

    Account(int  accountNumber, String accountHolderName){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }

    public float getBalance(){
        return this.balance;
    }
    public String getAccountName(){
        return this.accountHolderName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(float number){
        this.balance += number;
    }
    public String  withdraw(float number){
        if(balance >=number){
            this.balance -= number;
            return "Successfully Withdrawn";
        }
        return "Insufficient Amount";
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
