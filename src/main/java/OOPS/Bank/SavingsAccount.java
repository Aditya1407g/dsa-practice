package OOPS.Bank;

public class SavingsAccount extends Account{

    final float interestRate = 0.0045f;


    SavingsAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    public void giveMonthlyInterest(){
         float interestEarned = balance*interestRate;
         balance+= interestEarned;

    }


}
