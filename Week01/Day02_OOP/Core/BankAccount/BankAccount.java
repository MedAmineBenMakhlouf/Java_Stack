public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccount;
    private static double moneyStored;

    public double getCheckingBalance() {
        return this.checkingBalance;
    }


    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public static int getNumberOfAccount() {
        return numberOfAccount;
    }
    public static double getMoneyStored() {
        return moneyStored;
    }




    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        moneyStored = checkingBalance + savingsBalance;
        numberOfAccount++;
    }

    public void deposit(double amount, String selectedBalance) {
        if (selectedBalance == "saving") {
        if (amount > 0) {
            savingsBalance += amount;
        } else {
            System.out.println("the amount must be more then 0");
        }
        } else if (selectedBalance == "checking") {
        if (amount > 0) {
            checkingBalance += amount;
        } else {
            System.out.println("the amount must be more then 0");
        }
        }
        moneyStored += amount;
    }

    public void withdraw(double amount, String selectedBalance) {
        if (selectedBalance == "saving") {
        if (savingsBalance > amount) {
            savingsBalance -= amount;
        }
        else{
            System.out.println("you don't have enough balance in your saving account to make the transaction.");
        }
    }
    else if(selectedBalance == "checking")
    {
        if (checkingBalance >= amount){
            checkingBalance-=amount;
        }
        else{
            System.out.println("you don't have enough balance in your checking account to make the transaction.");
            }
        }
        moneyStored -= amount;
    }
    public void getBalances() {
		System.out.println("Checking account: $" + getCheckingBalance());
		System.out.println("Savings account: $" + getSavingsBalance());
	}
}
