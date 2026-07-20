package Bank;


    public abstract class BasicFunctionalities implements BasicFunctionalitiesInterface {
        private int accountNumber;
        private int balance;
        private String ownerName;

        public int getaccountNumber(){
            return this.accountNumber;
        }
        public int getbalance(){
            return this.balance;
        }
        public String getownerName(){
            return this.ownerName;
        }
        public void setaccountNumber(int an){
            this.accountNumber=an;
        }
        public void setbalance(int b){
            this.balance=b;
        }
        public void setownerName(String on){
            this.ownerName=on;
        }


    }

