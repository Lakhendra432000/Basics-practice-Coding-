package oops_concept.encapsulation;

public class BankAccountEncapsulation {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
        else{
            System.out.println("invalid balance");
        }
    }
    public void deposit (double amount){
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("You have deposited :" + amount + "rs and now A/c balance: " + balance + "rs.");
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void withdraw(double amount){
        if(balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successfully:" + amount + "rs. and Available balance:" + balance + "rs.");
        }
        else{
            System.out.println("Insufficient balance");
        }
        }
}


