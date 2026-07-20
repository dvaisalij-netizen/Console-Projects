package Calculator;

public class Multiplier extends Calculator implements Multiplierinterface{
    public Multiplier(String calculatorId,Userinterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
        this.setNum(user.getNum());
    }


    public void compute(){
        this.setResult(getNum()[0]*getNum()[1]*getNum()[2]);
        System.out.println("the final result");
        System.out.println(this.getResult());
    }

}