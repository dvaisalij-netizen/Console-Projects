package Calculator;

public class User implements Userinterface {

    private int[] num=new int[3];
    private String calculatorType;
    private Adderinterface adder;
    private Multiplierinterface multiplier;

    public User(){

    }
    public String getCalculatorType() {

        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public Adderinterface getAdder() {
        return adder;
    }

    public void setAdder(Adderinterface adder) {
        this.adder = adder;
    }

    public Multiplierinterface getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Multiplierinterface multiplier) {
        this.multiplier = multiplier;
    }
}