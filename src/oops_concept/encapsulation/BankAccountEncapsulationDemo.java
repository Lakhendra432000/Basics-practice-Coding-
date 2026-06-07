package oops_concept.encapsulation;

public class BankAccountEncapsulationDemo {
        public static void main(String[] args) {
            BankAccountEncapsulation bank = new BankAccountEncapsulation();
            bank.setAccountNumber(5726366376l);
            bank.setAccountHolderName("Rahul");
            bank.deposit(398770);
            bank.withdraw(5677);


        }
}
