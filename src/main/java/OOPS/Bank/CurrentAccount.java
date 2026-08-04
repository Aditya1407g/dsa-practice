package OOPS.Bank;

public class CurrentAccount extends Account{


    private final int overDraft = 15000;


    CurrentAccount(int accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }


    @Override
    public String withdraw(float number){
        if(balance+overDraft >=number){
            this.balance -= number;
            return "Successfully Withdrawn";
        }
        return "Insufficient Amount";
    }
}
