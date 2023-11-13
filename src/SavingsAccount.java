public class SavingsAccount extends BankAccount {
    private double rate = 0.025; // annual interest rate
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialAmount) {
        super(name, initialAmount);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
    
    public void postInterest() {
        double monthlyInterest = getBalance() * rate / 12;
        deposit(monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double initialAmount) {
        super(oldAccount, initialAmount);
        this.savingsNumber = oldAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
