package OOPS.Bank;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new SavingsAccount(1, "Aditya");
        accounts[1]= new CurrentAccount(2,"Ramesh");
        accounts[2]= new FixedDepositAccount(3,  "Priya" , 5);

        for(Account a:accounts){
            a.deposit(10000);
        }

        for(Account a :accounts){
            System.out.println(a.getAccountName() + " : " + a.withdraw(12000));
        }

        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).giveMonthlyInterest();
            } else if (a instanceof FixedDepositAccount) {
                ((FixedDepositAccount) a).giveYearlyInterest();
            }
            // CurrentAccount has no interest — skip
        }

// Print all again to see interest applied
        for (Account a : accounts) {
            System.out.println(a);
        }

    }
}
