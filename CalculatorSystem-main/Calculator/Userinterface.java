package Calculator;

public interface Userinterface {
    public String getCalculatorType();
    public void setCalculatorType(String calculatorType);
    public int[] getNum();
    public void setNum(int[] num);
    public Adderinterface getAdder();
    public void setAdder(Adderinterface adder);
    public Multiplierinterface getMultiplier();
    public void setMultiplier(Multiplierinterface multiplier);
}


