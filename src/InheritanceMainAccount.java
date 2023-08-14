public class InheritanceMainAccount
{
    public static void main(String[] args)
    {
        Bank bank = new Bank(10);

        SavingAccount savingAccount = new SavingAccount("EFGH 5678", 10000.0, 2.0);
        CurrentAccount currentAccount = new CurrentAccount("ABCD 1234", 20000.0, 500.0);

        bank.openAccount(savingAccount);
        bank.openAccount(currentAccount);

        bank.payDividend(50.0);

        bank.update();
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
}

class SavingAccount extends Account
{
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}

class CurrentAccount extends Account
{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit)
    {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount)
    {
        if (getBalance() - amount >= -overdraftLimit)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

class Bank
{
    private Account[] accounts;
    private int numAccounts;

    public Bank(int maxAccounts)
    {
        accounts = new Account[maxAccounts];
        numAccounts = 0;
    }

    public void openAccount(Account account)
    {
        if (numAccounts < accounts.length)
        {
            accounts[numAccounts] = account;
            numAccounts++;
        }
        else
        {
            System.out.println("Bank is full, cannot open more accounts");
        }
    }

    public void closeAccount(int index)
    {
        if (index >= 0 && index < numAccounts)
        {
            for (int i = index; i < numAccounts - 1; i++)
            {
                accounts[i] = accounts[i + 1];
            }
            numAccounts--;
        }
        else
        {
            System.out.println("Invalid account index");
        }
    }

    public void payDividend(double amount)
    {
        for (int i = 0; i < numAccounts; i++)
        {
            accounts[i].deposit(amount);
        }
    }

    public void update()
    {
        for (int i = 0; i < numAccounts; i++)
        {
            if (accounts[i] instanceof SavingAccount)
            {
                ((SavingAccount) accounts[i]).addInterest();
            }
            else if (accounts[i] instanceof CurrentAccount)
            {
                CurrentAccount currentAccount = (CurrentAccount) accounts[i];
                if (currentAccount.getBalance() < 0)
                {
                    System.out.println("Sending letter for overdraft account: " + currentAccount.getAccountNumber());
                }
            }
        }
    }
}
