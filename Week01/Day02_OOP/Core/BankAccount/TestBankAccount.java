public class TestBankAccount{
    public static void main(String[] args)
    {
        //Create a new Bank Account with an initial balance of 100.
        //Instantiate the bank account object and call deposit method to add money into it, then withdraw some amount from it.
        BankAccount account = new BankAccount(1000,25100);
        account.deposit(25,"checking");
        System.out.println(account.getCheckingBalance());
        account.withdraw(75,"saving");
        System.out.println(account.getSavingsBalance());
        System.out.println(BankAccount.getNumberOfAccount());    
        System.out.println(BankAccount.getMoneyStored());    
    }
}