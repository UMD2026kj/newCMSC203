public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // fee for clearing one check
    
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        super.setAccountNumber(super.getAccountNumber() + "-10");
    }
    
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }
}
