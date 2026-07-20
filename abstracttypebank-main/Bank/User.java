package Bank;

public class User implements UserInterface{
    private int amount;
    private int depositAmount;
    private int withdrawAmount;
    private String accountType;
    private int accountNumber;
    private String name;
    private int balance;

    public int getamount(){
        return this.amount;
    }
    public int getdepositAmount(){
        return this.depositAmount;
    }
    public int getwithdrawAmount(){
        return this.withdrawAmount;
    }
    public String getaccountType(){
        return this.accountType;
    }
    public int getaccountNumber(){
        return this.accountNumber;
    }
    public String getname(){
        return this.name;
    }
    public int getbalance(){
        return this.balance;
    }
    public void setamount(int amount){
        this.amount=amount;
    }
    public void setdepositAmount(int da){
        this.depositAmount=da;
    }
    public void setwithdrawAmount(int wda){
        this.withdrawAmount=wda;
    }
    public void setaccountType(String at){
        this.accountType=at;
    }
    public void setaccountNumber(int an){
        this.accountNumber=an;
    }
    public void setname(String sn){
        this.name=sn;
    }
    public void setbalance(int b){
        this.balance=b;
    }
    public int operation(){
        if(this.name=="Deposit"){
            return this.amount+this.depositAmount;
        }
        else if(this.name=="Credit"){
            return this.amount-this.withdrawAmount;
        }
        else{
            return 0;
        }
    }

}