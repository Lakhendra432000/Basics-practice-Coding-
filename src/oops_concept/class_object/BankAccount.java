package oops_concept.class_object;

public class BankAccount {

    long accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }
    void display(){
        System.out.println("Account Number:"+ accountNumber);
        System.out.println("Customer Name:"+ accountHolderName);
        System.out.println("Balance:"+balance);
    }
}


