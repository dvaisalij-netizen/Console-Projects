package Bank;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        User user1 = new User();

        SavingsAccount savingsaccount = new SavingsAccount();
        CurrentAccount currentaccount = new CurrentAccount();


        user.setaccountType("Savings Account");
        user.setname("Deposit");
        user.setdepositAmount(10000);

        savingsaccount.setbalance(user.operation());


        user1.setaccountType("Current Account");
        user1.setname("Deposit");
        user1.setdepositAmount(50000);

        currentaccount.setbalance(user1.operation());


        if (user.getaccountType() == "Savings Account") {
            System.out.println("USER1:SAVINGS");
            System.out.println("Deposited:");
            System.out.println(user.getdepositAmount());
            System.out.println("Balance:");
            System.out.println(savingsaccount.getbalance());
            System.out.println("Fixed Deposit Created");
        }

        if (user1.getaccountType() == "Current Account") {
            System.out.println("USER2:CURRENT");
            System.out.println("Deposited:");
            System.out.println(user1.getdepositAmount());
            System.out.println("Balance:");
            System.out.println(currentaccount.getbalance());
            System.out.println("Overdraft Enabled");
        }
    }
}