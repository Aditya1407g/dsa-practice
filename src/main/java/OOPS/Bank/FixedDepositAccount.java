package OOPS.Bank;

public class FixedDepositAccount extends Account {

    private final float yearlyInterest =0.07f;
    private final int fixedTerm ;
    private final int fineIfEarlyExit = 3;
    private int currentTerm=0;


    FixedDepositAccount(int accountNumber, String accountHolderName, int fixedTerm) {
        super(accountNumber, accountHolderName);
        this.fixedTerm=fixedTerm;
    }

    public void giveYearlyInterest(){
        float interestEarned = balance*yearlyInterest;
        balance+= interestEarned;
        currentTerm++;
    }

    @Override
    public String withdraw(float number){
        if(fixedTerm>currentTerm){
           float tempBalance = balance - (balance *fineIfEarlyExit/100);
            if(tempBalance-number>=0){
                balance=tempBalance;
                balance -= number;
                return "Successfully withdrawn and fine amount  detected due to early exit ";
            }
            else{
               return  "Insufficient balance";
            }
        }
        return super.withdraw(number);
    }


}
