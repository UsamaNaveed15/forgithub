//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

public class InheritanceBankAccount
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(10000);
        account.deposit(2000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(15000);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(3000);
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}

class BankAccount {
    protected int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount)
    {

        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposite amount: " + amount);
        }
        else
        {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(int amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        }
        else
        {
            System.out.println("Invalid withdraw");
        }
    }

    public int getBalance()
    {
        return balance;
    }
}

class SavingsAccount extends BankAccount
{
    public SavingsAccount(int initialBalance)
    {
        super(initialBalance);
    }

    @Override
    public void withdraw(int amount)
    {
        if (amount > 0 && amount <= balance && balance - amount >= 100)
        {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        }
        else
        {
            System.out.println("Invalid withdraw");
        }
    }
}