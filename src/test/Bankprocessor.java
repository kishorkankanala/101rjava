package test;

public class Bankprocessor {

    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount(1001, "Kishor", 5000.0);

        System.out.println("Account number : " + account.getaccountnumber());
        System.out.println("Account Holder : " + account.getaccountholder());
        System.out.println("Current Balance : " + account.getbalance());

        // Deposit
        account.deposit(2000);

        // Withdraw
        account.withdraw(3000);

        // Withdraw with insufficient balance
        account.withdraw(6000);

        System.out.println("Updated Balance : " + account.getbalance());
    }
}