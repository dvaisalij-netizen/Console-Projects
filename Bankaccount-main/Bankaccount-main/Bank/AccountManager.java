package Bank;

public class AccountManager extends Account
            implements SavingsAccountInterface, CurrentAccountInterface {

        public void deposit() {
            setBalanceValue(getBalanceValue() + getAmount());
            System.out.println("Deposited: " + getAmount());
        }

        public void withdraw() {
            setBalanceValue(getBalanceValue() - getAmount());
        }

        public int getBalance() {
            return getBalanceValue();
        }

        public void createFixedDeposit() {
            System.out.println("Fixed Deposit Created");
        }

        public void enableOverdraft() {
            System.out.println("Overdraft Enabled");
        }
    }

