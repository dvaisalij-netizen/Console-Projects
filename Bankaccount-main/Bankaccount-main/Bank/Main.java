package Bank;

public class Main {

        public static void main(String[] args) {

            User user1 = new User();
            User user2 = new User();

            user1.setAccountType("SAVINGS");
            user2.setAccountType("CURRENT");

            AccountManager manager = new AccountManager();

            SavingsAccountInterface savings = manager;
            CurrentAccountInterface current = manager;


            System.out.println("USER 1: SAVINGS");
            manager.setAmount(10000);
            manager.deposit();
            user1.setLastBalance(manager.getBalance());
            System.out.println("Balance: " + user1.getLastBalance());

            if (user1.getAccountType().equals("SAVINGS")) {
                savings.createFixedDeposit();
            }

            System.out.println();

            // USER 2 – CURRENT
            System.out.println("USER 2: CURRENT");
            manager.setAmount(50000);
            manager.deposit();
            user2.setLastBalance(manager.getBalance());
            System.out.println("Balance: " + user2.getLastBalance());

            if (user2.getAccountType().equals("CURRENT")) {
                current.enableOverdraft();
            }
        }
    }

