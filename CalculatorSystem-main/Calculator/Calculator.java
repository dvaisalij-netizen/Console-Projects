package Calculator;
public abstract class Calculator implements Calculatorinterface{
    //Known
    private String calculatorId;
    private int result;
    //Unknown
    //private int[] num=new int[3];
    private int [] num;
    private Userinterface user;

    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Userinterface getUser() {
        return user;
    }

    public void setUser(Userinterface user) {
        this.user = user;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
}