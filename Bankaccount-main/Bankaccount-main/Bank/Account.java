package Bank;

public class Account {

        private int accountNumber;
        private int balance;
        private String ownerName;
        private int amount;

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getBalanceValue() {
            return balance;
        }

        public void setBalanceValue(int balance) {
            this.balance = balance;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }

