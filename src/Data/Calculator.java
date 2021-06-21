package Data;

public class Calculator {
    private float number1, number2, result;

    public Calculator(float number1, float number2, float result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public float multiply(){
        this.result=this.number1*this.number2;
        return result;
    }

    public float div(){
        this.result=this.number1*this.number2;
        return result;
    }
    
}
