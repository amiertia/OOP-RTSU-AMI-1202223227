public class Account {

    private String Name;
    private String AccountNumber;
    private Double Balance;

    public Account(String name, String accountNumber, Double Balance) {
        this.Name = name;
        this.AccountNumber = accountNumber;
        this.Balance = Balance;
    }

    public boolean Deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            return true;
        }
        return false;
    }

    public boolean Withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            return true;
        }
        return false;
    }

    public String GetAccountInfo() {
        return "Name: " + Name + ", Account Number: " + AccountNumber + ", Balance: " + Balance;
    }

    public Double GetAccountBalance() {
        return Balance;
    }

    public String GetAccountNumber() {
        return AccountNumber;
    }

    public String getName() {
        return Name;
    }

}
