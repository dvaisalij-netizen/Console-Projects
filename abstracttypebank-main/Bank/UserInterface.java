package Bank;

public interface UserInterface {

         int getamount();
         int getdepositAmount();
         int getwithdrawAmount();
         String getaccountType();
         int getaccountNumber();
         String getname();
         int getbalance();
         void setamount(int amount);
         void setdepositAmount(int da);
         void setwithdrawAmount(int wda);
         void setaccountType(String at);
         void setaccountNumber(int an);
         void setname(String sn);
         void setbalance(int b);
         int operation();
    }

